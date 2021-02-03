(ns clojure-kubernetes-client.specs.v1alpha1-role-ref
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-role-ref-data v1alpha1-role-ref)
(def v1alpha1-role-ref-data
  {
   (ds/req :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   })

(def v1alpha1-role-ref
  (ds/spec
    {:name ::v1alpha1-role-ref
     :spec v1alpha1-role-ref-data}))

