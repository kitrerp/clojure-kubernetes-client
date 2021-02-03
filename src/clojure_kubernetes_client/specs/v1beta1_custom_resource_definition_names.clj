(ns clojure-kubernetes-client.specs.v1beta1-custom-resource-definition-names
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-custom-resource-definition-names-data v1beta1-custom-resource-definition-names)
(def v1beta1-custom-resource-definition-names-data
  {
   (ds/opt :categories) (s/coll-of string?)
   (ds/req :kind) string?
   (ds/opt :listKind) string?
   (ds/req :plural) string?
   (ds/opt :shortNames) (s/coll-of string?)
   (ds/opt :singular) string?
   })

(def v1beta1-custom-resource-definition-names
  (ds/spec
    {:name ::v1beta1-custom-resource-definition-names
     :spec v1beta1-custom-resource-definition-names-data}))

