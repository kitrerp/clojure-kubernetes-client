(ns clojure-kubernetes-client.specs.v1-certificate-signing-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-certificate-signing-request-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-certificate-signing-request-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-certificate-signing-request-data v1-certificate-signing-request)
(def v1-certificate-signing-request-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-certificate-signing-request-spec
   (ds/opt :status) v1-certificate-signing-request-status
   })

(def v1-certificate-signing-request
  (ds/spec
    {:name ::v1-certificate-signing-request
     :spec v1-certificate-signing-request-data}))

