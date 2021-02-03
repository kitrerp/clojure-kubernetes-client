(ns clojure-kubernetes-client.specs.v1-ingress-class
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-ingress-class-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-class-data v1-ingress-class)
(def v1-ingress-class-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-ingress-class-spec
   })

(def v1-ingress-class
  (ds/spec
    {:name ::v1-ingress-class
     :spec v1-ingress-class-data}))

