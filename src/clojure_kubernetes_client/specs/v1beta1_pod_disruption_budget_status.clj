(ns clojure-kubernetes-client.specs.v1beta1-pod-disruption-budget-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-pod-disruption-budget-status-data v1beta1-pod-disruption-budget-status)
(def v1beta1-pod-disruption-budget-status-data
  {
   (ds/req :currentHealthy) int?
   (ds/req :desiredHealthy) int?
   (ds/opt :disruptedPods) (s/map-of string? inst?)
   (ds/req :disruptionsAllowed) int?
   (ds/req :expectedPods) int?
   (ds/opt :observedGeneration) int?
   })

(def v1beta1-pod-disruption-budget-status
  (ds/spec
    {:name ::v1beta1-pod-disruption-budget-status
     :spec v1beta1-pod-disruption-budget-status-data}))

