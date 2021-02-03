(ns clojure-kubernetes-client.specs.v1-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-condition-data v1-condition)
(def v1-condition-data
  {
   (ds/req :lastTransitionTime) inst?
   (ds/req :message) string?
   (ds/opt :observedGeneration) int?
   (ds/req :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-condition
  (ds/spec
    {:name ::v1-condition
     :spec v1-condition-data}))

