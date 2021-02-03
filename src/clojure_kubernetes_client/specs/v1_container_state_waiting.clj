(ns clojure-kubernetes-client.specs.v1-container-state-waiting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-container-state-waiting-data v1-container-state-waiting)
(def v1-container-state-waiting-data
  {
   (ds/opt :message) string?
   (ds/opt :reason) string?
   })

(def v1-container-state-waiting
  (ds/spec
    {:name ::v1-container-state-waiting
     :spec v1-container-state-waiting-data}))

