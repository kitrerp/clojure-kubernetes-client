(ns clojure-kubernetes-client.specs.v1-ingress-service-backend
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1-service-backend-port :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-service-backend-data v1-ingress-service-backend)
(def v1-ingress-service-backend-data
  {
   (ds/req :name) string?
   (ds/opt :port) v1-service-backend-port
   })

(def v1-ingress-service-backend
  (ds/spec
    {:name ::v1-ingress-service-backend
     :spec v1-ingress-service-backend-data}))

