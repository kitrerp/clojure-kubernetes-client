(ns clojure-kubernetes-client.specs.v1-ingress-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-load-balancer-status :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-status-data v1-ingress-status)
(def v1-ingress-status-data
  {
   (ds/opt :loadBalancer) v1-load-balancer-status
   })

(def v1-ingress-status
  (ds/spec
    {:name ::v1-ingress-status
     :spec v1-ingress-status-data}))

