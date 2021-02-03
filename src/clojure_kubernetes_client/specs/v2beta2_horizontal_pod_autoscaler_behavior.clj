(ns clojure-kubernetes-client.specs.v2beta2-horizontal-pod-autoscaler-behavior
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v2beta2-hpa-scaling-rules :refer :all]
            [clojure-kubernetes-client.specs.v2beta2-hpa-scaling-rules :refer :all]
            )
  (:import (java.io File)))


(declare v2beta2-horizontal-pod-autoscaler-behavior-data v2beta2-horizontal-pod-autoscaler-behavior)
(def v2beta2-horizontal-pod-autoscaler-behavior-data
  {
   (ds/opt :scaleDown) v2beta2-hpa-scaling-rules
   (ds/opt :scaleUp) v2beta2-hpa-scaling-rules
   })

(def v2beta2-horizontal-pod-autoscaler-behavior
  (ds/spec
    {:name ::v2beta2-horizontal-pod-autoscaler-behavior
     :spec v2beta2-horizontal-pod-autoscaler-behavior-data}))

