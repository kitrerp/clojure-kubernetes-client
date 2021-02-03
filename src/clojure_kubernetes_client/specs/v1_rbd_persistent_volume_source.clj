(ns clojure-kubernetes-client.specs.v1-rbd-persistent-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.v1-secret-reference :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-rbd-persistent-volume-source-data v1-rbd-persistent-volume-source)
(def v1-rbd-persistent-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :image) string?
   (ds/opt :keyring) string?
   (ds/req :monitors) (s/coll-of string?)
   (ds/opt :pool) string?
   (ds/opt :readOnly) boolean?
   (ds/opt :secretRef) v1-secret-reference
   (ds/opt :user) string?
   })

(def v1-rbd-persistent-volume-source
  (ds/spec
    {:name ::v1-rbd-persistent-volume-source
     :spec v1-rbd-persistent-volume-source-data}))

