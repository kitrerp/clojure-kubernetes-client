(ns clojure-kubernetes-client.specs.v1-scheduling
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-toleration :refer :all])
  (:import (java.io File)))


(declare v1-scheduling-data v1-scheduling)
(def v1-scheduling-data
  {
   (ds/opt :nodeSelector) (s/map-of string? string?)
   (ds/opt :tolerations) (s/coll-of v1-toleration)
   })

(def v1-scheduling
  (ds/spec
    {:name ::v1-scheduling
     :spec v1-scheduling-data}))

