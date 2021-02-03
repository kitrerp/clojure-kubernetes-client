(ns clojure-kubernetes-client.specs.v1-service-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-service-port :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-session-affinity-config :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-spec-data v1-service-spec)
(def v1-service-spec-data
  {
   (ds/opt :allocateLoadBalancerNodePorts) boolean?
   (ds/opt :clusterIP) string?
   (ds/opt :clusterIPs) (s/coll-of string?)
   (ds/opt :externalIPs) (s/coll-of string?)
   (ds/opt :externalName) string?
   (ds/opt :externalTrafficPolicy) string?
   (ds/opt :healthCheckNodePort) int?
   (ds/opt :ipFamilies) (s/coll-of string?)
   (ds/opt :ipFamilyPolicy) string?
   (ds/opt :loadBalancerIP) string?
   (ds/opt :loadBalancerSourceRanges) (s/coll-of string?)
   (ds/opt :ports) (s/coll-of v1-service-port)
   (ds/opt :publishNotReadyAddresses) boolean?
   (ds/opt :selector) (s/map-of string? string?)
   (ds/opt :sessionAffinity) string?
   (ds/opt :sessionAffinityConfig) v1-session-affinity-config
   (ds/opt :topologyKeys) (s/coll-of string?)
   (ds/opt :type) string?
   })

(def v1-service-spec
  (ds/spec
    {:name ::v1-service-spec
     :spec v1-service-spec-data}))

