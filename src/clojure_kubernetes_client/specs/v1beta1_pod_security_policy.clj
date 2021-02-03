(ns clojure-kubernetes-client.specs.v1beta1-pod-security-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-pod-security-policy-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-pod-security-policy-data v1beta1-pod-security-policy)
(def v1beta1-pod-security-policy-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-pod-security-policy-spec
   })

(def v1beta1-pod-security-policy
  (ds/spec
    {:name ::v1beta1-pod-security-policy
     :spec v1beta1-pod-security-policy-data}))

