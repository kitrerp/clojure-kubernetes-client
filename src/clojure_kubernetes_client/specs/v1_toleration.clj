(ns clojure-kubernetes-client.specs.v1-toleration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-toleration-data v1-toleration)
(def v1-toleration-data
  {
   (ds/opt :effect) string?
   (ds/opt :key) string?
   (ds/opt :operator) string?
   (ds/opt :tolerationSeconds) int?
   (ds/opt :value) string?
   })

(def v1-toleration
  (ds/spec
    {:name ::v1-toleration
     :spec v1-toleration-data}))

