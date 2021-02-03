(ns clojure-kubernetes-client.specs.v2beta1-external-metric-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            )
  (:import (java.io File)))


(declare v2beta1-external-metric-status-data v2beta1-external-metric-status)
(def v2beta1-external-metric-status-data
  {
   (ds/opt :currentAverageValue) string?
   (ds/req :currentValue) string?
   (ds/req :metricName) string?
   (ds/opt :metricSelector) v1-label-selector
   })

(def v2beta1-external-metric-status
  (ds/spec
    {:name ::v2beta1-external-metric-status
     :spec v2beta1-external-metric-status-data}))

