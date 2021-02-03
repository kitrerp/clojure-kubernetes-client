(ns clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-limited-priority-level-configuration :refer :all]

            )
  (:import (java.io File)))


(declare v1beta1-priority-level-configuration-spec-data v1beta1-priority-level-configuration-spec)
(def v1beta1-priority-level-configuration-spec-data
  {
   (ds/opt :limited) v1beta1-limited-priority-level-configuration
   (ds/req :type) string?
   })

(def v1beta1-priority-level-configuration-spec
  (ds/spec
    {:name ::v1beta1-priority-level-configuration-spec
     :spec v1beta1-priority-level-configuration-spec-data}))

