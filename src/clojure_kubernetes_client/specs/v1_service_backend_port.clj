(ns clojure-kubernetes-client.specs.v1-service-backend-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            )
  (:import (java.io File)))


(declare v1-service-backend-port-data v1-service-backend-port)
(def v1-service-backend-port-data
  {
   (ds/opt :name) string?
   (ds/opt :number) int?
   })

(def v1-service-backend-port
  (ds/spec
    {:name ::v1-service-backend-port
     :spec v1-service-backend-port-data}))

