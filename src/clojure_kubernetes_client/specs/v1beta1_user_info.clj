(ns clojure-kubernetes-client.specs.v1beta1-user-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.list? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-user-info-data v1beta1-user-info)
(def v1beta1-user-info-data
  {
   (ds/opt :extra) (s/map-of string? (s/coll-of string?))
   (ds/opt :groups) (s/coll-of string?)
   (ds/opt :uid) string?
   (ds/opt :username) string?
   })

(def v1beta1-user-info
  (ds/spec
    {:name ::v1beta1-user-info
     :spec v1beta1-user-info-data}))

