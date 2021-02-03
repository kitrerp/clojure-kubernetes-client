(ns clojure-kubernetes-client.specs.v1-policy-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-policy-rule-data v1-policy-rule)
(def v1-policy-rule-data
  {
   (ds/opt :apiGroups) (s/coll-of string?)
   (ds/opt :nonResourceURLs) (s/coll-of string?)
   (ds/opt :resourceNames) (s/coll-of string?)
   (ds/opt :resources) (s/coll-of string?)
   (ds/req :verbs) (s/coll-of string?)
   })

(def v1-policy-rule
  (ds/spec
    {:name ::v1-policy-rule
     :spec v1-policy-rule-data}))

