(ns clojure-kubernetes-client.specs.networking-v1beta1-ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]

            
            )
  (:import (java.io File)))


(declare networking-v1beta1-ingress-backend-data networking-v1beta1-ingress-backend)
(def networking-v1beta1-ingress-backend-data
  {
   (ds/opt :resource) v1-typed-local-object-reference
   (ds/opt :serviceName) string?
   (ds/opt :servicePort) any?
   })

(def networking-v1beta1-ingress-backend
  (ds/spec
    {:name ::networking-v1beta1-ingress-backend
     :spec networking-v1beta1-ingress-backend-data}))

