(ns clojure-kubernetes-client.specs.v1-gce-persistent-disk-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]




            )
  (:import (java.io File)))


(declare v1-gce-persistent-disk-volume-source-data v1-gce-persistent-disk-volume-source)
(def v1-gce-persistent-disk-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/opt :partition) int?
   (ds/req :pdName) string?
   (ds/opt :readOnly) boolean?
   })

(def v1-gce-persistent-disk-volume-source
  (ds/spec
    {:name ::v1-gce-persistent-disk-volume-source
     :spec v1-gce-persistent-disk-volume-source-data}))

