(ns clojure-kubernetes-client.specs.v1-http-ingress-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-ingress-backend :refer :all]


            )
  (:import (java.io File)))


(declare v1-http-ingress-path-data v1-http-ingress-path)
(def v1-http-ingress-path-data
  {
   (ds/req :backend) v1-ingress-backend
   (ds/opt :path) string?
   (ds/opt :pathType) string?
   })

(def v1-http-ingress-path
  (ds/spec
    {:name ::v1-http-ingress-path
     :spec v1-http-ingress-path-data}))

