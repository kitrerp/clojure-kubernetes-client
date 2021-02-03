(ns clojure-kubernetes-client.specs.v1-stateful-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-stateful-set-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-stateful-set-data v1-stateful-set)
(def v1-stateful-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-stateful-set-spec
   (ds/opt :status) v1-stateful-set-status
   })

(def v1-stateful-set
  (ds/spec
    {:name ::v1-stateful-set
     :spec v1-stateful-set-data}))

