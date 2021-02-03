(ns clojure-kubernetes-client.specs.v2beta2-cross-version-object-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-cross-version-object-reference-data v2beta2-cross-version-object-reference)
(def v2beta2-cross-version-object-reference-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v2beta2-cross-version-object-reference
  (ds/spec
    {:name ::v2beta2-cross-version-object-reference
     :spec v2beta2-cross-version-object-reference-data}))

