(ns clojure-kubernetes-client.specs.v1-volume-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            )
  (:import (java.io File)))


(declare v1-volume-error-data v1-volume-error)
(def v1-volume-error-data
  {
   (ds/opt :message) string?
   (ds/opt :time) inst?
   })

(def v1-volume-error
  (ds/spec
    {:name ::v1-volume-error
     :spec v1-volume-error-data}))

