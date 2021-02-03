(ns clojure-kubernetes-client.specs.v1-certificate-signing-request-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-certificate-signing-request-condition-data v1-certificate-signing-request-condition)
(def v1-certificate-signing-request-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :lastUpdateTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-certificate-signing-request-condition
  (ds/spec
    {:name ::v1-certificate-signing-request-condition
     :spec v1-certificate-signing-request-condition-data}))

