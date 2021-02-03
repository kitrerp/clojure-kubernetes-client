(ns clojure-kubernetes-client.specs.v1beta1-event-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-event-series-data v1beta1-event-series)
(def v1beta1-event-series-data
  {
   (ds/req :count) int?
   (ds/req :lastObservedTime) inst?
   })

(def v1beta1-event-series
  (ds/spec
    {:name ::v1beta1-event-series
     :spec v1beta1-event-series-data}))

