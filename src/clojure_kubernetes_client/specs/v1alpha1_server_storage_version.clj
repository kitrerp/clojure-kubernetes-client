(ns clojure-kubernetes-client.specs.v1alpha1-server-storage-version
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds])
  (:import (java.io File)))


(declare v1alpha1-server-storage-version-data v1alpha1-server-storage-version)
(def v1alpha1-server-storage-version-data
  {
   (ds/opt :apiServerID) string?
   (ds/opt :decodableVersions) (s/coll-of string?)
   (ds/opt :encodingVersion) string?
   })

(def v1alpha1-server-storage-version
  (ds/spec
    {:name ::v1alpha1-server-storage-version
     :spec v1alpha1-server-storage-version-data}))

