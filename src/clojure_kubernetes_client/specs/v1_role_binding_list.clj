(ns clojure-kubernetes-client.specs.v1-role-binding-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-role-binding :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-role-binding-list-data v1-role-binding-list)
(def v1-role-binding-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-role-binding)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-role-binding-list
  (ds/spec
    {:name ::v1-role-binding-list
     :spec v1-role-binding-list-data}))

