(ns clojure-kubernetes-client.specs.v1beta1-pod-security-policy-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-security-policy :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-pod-security-policy-list-data v1beta1-pod-security-policy-list)
(def v1beta1-pod-security-policy-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1beta1-pod-security-policy)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1beta1-pod-security-policy-list
  (ds/spec
    {:name ::v1beta1-pod-security-policy-list
     :spec v1beta1-pod-security-policy-list-data}))
