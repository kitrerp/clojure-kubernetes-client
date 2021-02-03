(ns clojure-kubernetes-client.specs.core-v1-event-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.core-v1-event :refer :all]

            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare core-v1-event-list-data core-v1-event-list)
(def core-v1-event-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of core-v1-event)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def core-v1-event-list
  (ds/spec
    {:name ::core-v1-event-list
     :spec core-v1-event-list-data}))

