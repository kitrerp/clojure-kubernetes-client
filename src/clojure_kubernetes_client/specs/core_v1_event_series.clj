(ns clojure-kubernetes-client.specs.core-v1-event-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare core-v1-event-series-data core-v1-event-series)
(def core-v1-event-series-data
  {
   (ds/opt :count) int?
   (ds/opt :lastObservedTime) inst?
   })

(def core-v1-event-series
  (ds/spec
    {:name ::core-v1-event-series
     :spec core-v1-event-series-data}))

