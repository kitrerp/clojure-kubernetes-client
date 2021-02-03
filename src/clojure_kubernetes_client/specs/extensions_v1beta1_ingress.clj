(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-spec :refer :all]
            [clojure-kubernetes-client.specs.extensions-v1beta1-ingress-status :refer :all]
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-data extensions-v1beta1-ingress)
(def extensions-v1beta1-ingress-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) extensions-v1beta1-ingress-spec
   (ds/opt :status) extensions-v1beta1-ingress-status
   })

(def extensions-v1beta1-ingress
  (ds/spec
    {:name ::extensions-v1beta1-ingress
     :spec extensions-v1beta1-ingress-data}))

