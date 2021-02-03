(ns clojure-kubernetes-client.specs.v1-network-policy-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-network-policy :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-network-policy-list-data v1-network-policy-list)
(def v1-network-policy-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-network-policy)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-network-policy-list
  (ds/spec
    {:name ::v1-network-policy-list
     :spec v1-network-policy-list-data}))

