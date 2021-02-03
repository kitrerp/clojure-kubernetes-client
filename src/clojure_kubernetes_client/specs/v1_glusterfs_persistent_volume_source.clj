(ns clojure-kubernetes-client.specs.v1-glusterfs-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            )
  (:import (java.io File)))


(declare v1-glusterfs-persistent-volume-source-data v1-glusterfs-persistent-volume-source)
(def v1-glusterfs-persistent-volume-source-data
  {
   (ds/req :endpoints) string?
   (ds/opt :endpointsNamespace) string?
   (ds/req :path) string?
   (ds/opt :readOnly) boolean?
   })

(def v1-glusterfs-persistent-volume-source
  (ds/spec
    {:name ::v1-glusterfs-persistent-volume-source
     :spec v1-glusterfs-persistent-volume-source-data}))

