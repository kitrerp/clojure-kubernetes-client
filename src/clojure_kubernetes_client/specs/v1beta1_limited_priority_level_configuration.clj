(ns clojure-kubernetes-client.specs.v1beta1-limited-priority-level-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1beta1-limit-response :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-limited-priority-level-configuration-data v1beta1-limited-priority-level-configuration)
(def v1beta1-limited-priority-level-configuration-data
  {
   (ds/opt :assuredConcurrencyShares) int?
   (ds/opt :limitResponse) v1beta1-limit-response
   })

(def v1beta1-limited-priority-level-configuration
  (ds/spec
    {:name ::v1beta1-limited-priority-level-configuration
     :spec v1beta1-limited-priority-level-configuration-data}))

