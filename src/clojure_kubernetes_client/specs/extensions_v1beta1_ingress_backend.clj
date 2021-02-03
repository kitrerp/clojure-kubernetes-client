(ns clojure-kubernetes-client.specs.extensions-v1beta1-ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            
            )
  (:import (java.io File)))


(declare extensions-v1beta1-ingress-backend-data extensions-v1beta1-ingress-backend)
(def extensions-v1beta1-ingress-backend-data
  {
   (ds/opt :resource) v1-typed-local-object-reference
   (ds/opt :serviceName) string?
   (ds/opt :servicePort) any?
   })

(def extensions-v1beta1-ingress-backend
  (ds/spec
    {:name ::extensions-v1beta1-ingress-backend
     :spec extensions-v1beta1-ingress-backend-data}))

