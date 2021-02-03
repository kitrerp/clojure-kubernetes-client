(ns clojure-kubernetes-client.specs.v1alpha1-storage-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            
            [clojure-kubernetes-client.specs.v1alpha1-storage-version-status :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-storage-version-data v1alpha1-storage-version)
(def v1alpha1-storage-version-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) any?
   (ds/req :status) v1alpha1-storage-version-status
   })

(def v1alpha1-storage-version
  (ds/spec
    {:name ::v1alpha1-storage-version
     :spec v1alpha1-storage-version-data}))

