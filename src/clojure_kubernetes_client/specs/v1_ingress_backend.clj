(ns clojure-kubernetes-client.specs.v1-ingress-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]
            [clojure-kubernetes-client.specs.v1-ingress-service-backend :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-backend-data v1-ingress-backend)
(def v1-ingress-backend-data
  {
   (ds/opt :resource) v1-typed-local-object-reference
   (ds/opt :service) v1-ingress-service-backend
   })

(def v1-ingress-backend
  (ds/spec
    {:name ::v1-ingress-backend
     :spec v1-ingress-backend-data}))

