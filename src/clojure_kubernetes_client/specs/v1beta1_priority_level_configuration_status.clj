(ns clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-condition :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-priority-level-configuration-status-data v1beta1-priority-level-configuration-status)
(def v1beta1-priority-level-configuration-status-data
  {
   (ds/opt :conditions) (s/coll-of v1beta1-priority-level-configuration-condition)
   })

(def v1beta1-priority-level-configuration-status
  (ds/spec
    {:name ::v1beta1-priority-level-configuration-status
     :spec v1beta1-priority-level-configuration-status-data}))

