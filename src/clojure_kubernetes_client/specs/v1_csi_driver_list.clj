(ns clojure-kubernetes-client.specs.v1-csi-driver-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-csi-driver :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-csi-driver-list-data v1-csi-driver-list)
(def v1-csi-driver-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-csi-driver)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-csi-driver-list
  (ds/spec
    {:name ::v1-csi-driver-list
     :spec v1-csi-driver-list-data}))
