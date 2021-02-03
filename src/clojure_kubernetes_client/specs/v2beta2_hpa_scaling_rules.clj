(ns clojure-kubernetes-client.specs.v2beta2-hpa-scaling-rules
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-hpa-scaling-policy :refer :all]


            )
  (:import (java.io File)))


(declare v2beta2-hpa-scaling-rules-data v2beta2-hpa-scaling-rules)
(def v2beta2-hpa-scaling-rules-data
  {
   (ds/opt :policies) (s/coll-of v2beta2-hpa-scaling-policy)
   (ds/opt :selectPolicy) string?
   (ds/opt :stabilizationWindowSeconds) int?
   })

(def v2beta2-hpa-scaling-rules
  (ds/spec
    {:name ::v2beta2-hpa-scaling-rules
     :spec v2beta2-hpa-scaling-rules-data}))

