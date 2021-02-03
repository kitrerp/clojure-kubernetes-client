(ns clojure-kubernetes-client.specs.v1alpha1-storage-version-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-storage-version-condition :refer :all]
            [clojure-kubernetes-client.specs.v1alpha1-server-storage-version :refer :all]
            )
  (:import (java.io File)))


(declare v1alpha1-storage-version-status-data v1alpha1-storage-version-status)
(def v1alpha1-storage-version-status-data
  {
   (ds/opt :commonEncodingVersion) string?
   (ds/opt :conditions) (s/coll-of v1alpha1-storage-version-condition)
   (ds/opt :storageVersions) (s/coll-of v1alpha1-server-storage-version)
   })

(def v1alpha1-storage-version-status
  (ds/spec
    {:name ::v1alpha1-storage-version-status
     :spec v1alpha1-storage-version-status-data}))

