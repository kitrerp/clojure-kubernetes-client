(ns clojure-kubernetes-client.specs.events-v1-event-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare events-v1-event-series-data events-v1-event-series)
(def events-v1-event-series-data
  {
   (ds/req :count) int?
   (ds/req :lastObservedTime) inst?
   })

(def events-v1-event-series
  (ds/spec
    {:name ::events-v1-event-series
     :spec events-v1-event-series-data}))

