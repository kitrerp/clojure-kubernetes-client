(ns clojure-kubernetes-client.specs.v1-api-service-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.any? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.apiregistration-v1-service-reference :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            )
  (:import (java.io File)))


(declare v1-api-service-spec-data v1-api-service-spec)
(def v1-api-service-spec-data
  {
   (ds/opt :caBundle) any?
   (ds/opt :group) string?
   (ds/req :groupPriorityMinimum) int?
   (ds/opt :insecureSkipTLSVerify) boolean?
   (ds/opt :service) apiregistration-v1-service-reference
   (ds/opt :version) string?
   (ds/req :versionPriority) int?
   })

(def v1-api-service-spec
  (ds/spec
    {:name ::v1-api-service-spec
     :spec v1-api-service-spec-data}))

