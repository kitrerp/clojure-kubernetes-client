(ns clojure-kubernetes-client.specs.v1-certificate-signing-request-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-certificate-signing-request :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-certificate-signing-request-list-data v1-certificate-signing-request-list)
(def v1-certificate-signing-request-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-certificate-signing-request)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-certificate-signing-request-list
  (ds/spec
    {:name ::v1-certificate-signing-request-list
     :spec v1-certificate-signing-request-list-data}))

