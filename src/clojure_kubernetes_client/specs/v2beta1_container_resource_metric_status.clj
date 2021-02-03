(ns clojure-kubernetes-client.specs.v2beta1-container-resource-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-container-resource-metric-status-data v2beta1-container-resource-metric-status)
(def v2beta1-container-resource-metric-status-data
  {
   (ds/req :container) string?
   (ds/opt :currentAverageUtilization) int?
   (ds/req :currentAverageValue) string?
   (ds/req :name) string?
   })

(def v2beta1-container-resource-metric-status
  (ds/spec
    {:name ::v2beta1-container-resource-metric-status
     :spec v2beta1-container-resource-metric-status-data}))

