(ns clojure-kubernetes-client.specs.v1-portworx-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-portworx-volume-source-data v1-portworx-volume-source)
(def v1-portworx-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :readOnly) boolean?
   (ds/req :volumeID) string?
   })

(def v1-portworx-volume-source
  (ds/spec
    {:name ::v1-portworx-volume-source
     :spec v1-portworx-volume-source-data}))

