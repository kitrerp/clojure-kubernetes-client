(ns clojure-kubernetes-client.specs.events-v1-event-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.events-v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare events-v1-event-list-data events-v1-event-list)
(def events-v1-event-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of events-v1-event)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def events-v1-event-list
  (ds/spec
    {:name ::events-v1-event-list
     :spec events-v1-event-list-data}))

