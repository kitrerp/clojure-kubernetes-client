(ns clojure-kubernetes-client.specs.v1-nfs-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-nfs-volume-source-data v1-nfs-volume-source)
(def v1-nfs-volume-source-data
  {
   (ds/req :path) string?
   (ds/opt :readOnly) boolean?
   (ds/req :server) string?
   })

(def v1-nfs-volume-source
  (ds/spec
    {:name ::v1-nfs-volume-source
     :spec v1-nfs-volume-source-data}))

