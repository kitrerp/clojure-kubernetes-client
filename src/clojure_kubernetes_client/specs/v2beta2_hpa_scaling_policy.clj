(ns clojure-kubernetes-client.specs.v2beta2-hpa-scaling-policy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]



            )
  (:import (java.io File)))


(declare v2beta2-hpa-scaling-policy-data v2beta2-hpa-scaling-policy)
(def v2beta2-hpa-scaling-policy-data
  {
   (ds/req :periodSeconds) int?
   (ds/req :type) string?
   (ds/req :value) int?
   })

(def v2beta2-hpa-scaling-policy
  (ds/spec
    {:name ::v2beta2-hpa-scaling-policy
     :spec v2beta2-hpa-scaling-policy-data}))

