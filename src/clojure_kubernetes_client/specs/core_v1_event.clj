(ns clojure-kubernetes-client.specs.core-v1-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-reference :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.core-v1-event-series :refer :all]
            [clojure-kubernetes-client.specs.v1-event-source :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare core-v1-event-data core-v1-event)
(def core-v1-event-data
  {
   (ds/opt :action) string?
   (ds/opt :apiVersion) string?
   (ds/opt :count) int?
   (ds/opt :eventTime) inst?
   (ds/opt :firstTimestamp) inst?
   (ds/req :involvedObject) v1-object-reference
   (ds/opt :kind) string?
   (ds/opt :lastTimestamp) inst?
   (ds/opt :message) string?
   (ds/req :metadata) v1-object-meta
   (ds/opt :reason) string?
   (ds/opt :related) v1-object-reference
   (ds/opt :reportingComponent) string?
   (ds/opt :reportingInstance) string?
   (ds/opt :series) core-v1-event-series
   (ds/opt :source) v1-event-source
   (ds/opt :type) string?
   })

(def core-v1-event
  (ds/spec
    {:name ::core-v1-event
     :spec core-v1-event-data}))

