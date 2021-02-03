(ns clojure-kubernetes-client.specs.v1-limit-range-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-limit-range :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-limit-range-list-data v1-limit-range-list)
(def v1-limit-range-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-limit-range)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-limit-range-list
  (ds/spec
    {:name ::v1-limit-range-list
     :spec v1-limit-range-list-data}))

