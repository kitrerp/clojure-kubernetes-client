(ns clojure-kubernetes-client.specs.v1-ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-ingress-spec :refer :all]
            [clojure-kubernetes-client.specs.v1-ingress-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-data v1-ingress)
(def v1-ingress-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-ingress-spec
   (ds/opt :status) v1-ingress-status
   })

(def v1-ingress
  (ds/spec
    {:name ::v1-ingress
     :spec v1-ingress-data}))

