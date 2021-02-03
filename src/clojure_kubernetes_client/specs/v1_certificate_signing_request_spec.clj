(ns clojure-kubernetes-client.specs.v1-certificate-signing-request-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.list? :refer :all]






            )
  (:import (java.io File)))


(declare v1-certificate-signing-request-spec-data v1-certificate-signing-request-spec)
(def v1-certificate-signing-request-spec-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/req :request) any?
   (ds/req :signerName) string?
   (ds/opt :uid) string?
   (ds/opt :usages) (s/coll-of string?)
   (ds/opt :username) string?
   })

(def v1-certificate-signing-request-spec
  (ds/spec
    {:name ::v1-certificate-signing-request-spec
     :spec v1-certificate-signing-request-spec-data}))

