(ns clojure-kubernetes-client.specs.v1-runtime-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-overhead :refer :all]
            [clojure-kubernetes-client.specs.v1-scheduling :refer :all]
            )
  (:import (java.io File)))


(declare v1-runtime-class-data v1-runtime-class)
(def v1-runtime-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :handler) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :overhead) v1-overhead
   (ds/opt :scheduling) v1-scheduling
   })

(def v1-runtime-class
  (ds/spec
    {:name ::v1-runtime-class
     :spec v1-runtime-class-data}))

