(ns clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-horizontal-pod-autoscaler-condition-data v2beta2-horizontal-pod-autoscaler-condition)
(def v2beta2-horizontal-pod-autoscaler-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v2beta2-horizontal-pod-autoscaler-condition
  (ds/spec
    {:name ::v2beta2-horizontal-pod-autoscaler-condition
     :spec v2beta2-horizontal-pod-autoscaler-condition-data}))

