(ns kubernetes.specs.v1alpha1/aggregation-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/label-selector :refer :all]
            )
  (:import (java.io File)))


(def v1alpha1/aggregation-rule-data
  {
   (ds/opt :clusterRoleSelectors) (s/coll-of v1/label-selector-spec)
   })

(def v1alpha1/aggregation-rule-spec
  (ds/spec
    {:name ::v1alpha1/aggregation-rule
     :spec v1alpha1/aggregation-rule-data}))
