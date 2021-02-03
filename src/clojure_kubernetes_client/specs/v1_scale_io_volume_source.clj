(ns clojure-kubernetes-client.specs.v1-scale-io-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.v1-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-scale-io-volume-source-data v1-scale-io-volume-source)
(def v1-scale-io-volume-source-data
  {
   (ds/opt :fsType) string?
   (ds/req :gateway) string?
   (ds/opt :protectionDomain) string?
   (ds/opt :readOnly) boolean?
   (ds/req :secretRef) v1-local-object-reference
   (ds/opt :sslEnabled) boolean?
   (ds/opt :storageMode) string?
   (ds/opt :storagePool) string?
   (ds/req :system) string?
   (ds/opt :volumeName) string?
   })

(def v1-scale-io-volume-source
  (ds/spec
    {:name ::v1-scale-io-volume-source
     :spec v1-scale-io-volume-source-data}))

