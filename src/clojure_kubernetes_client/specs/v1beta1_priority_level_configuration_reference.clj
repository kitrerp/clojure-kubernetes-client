(ns clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds])
  (:import (java.io File)))


(declare v1beta1-priority-level-configuration-reference-data v1beta1-priority-level-configuration-reference)
(def v1beta1-priority-level-configuration-reference-data
  {
   (ds/req :name) string?
   })

(def v1beta1-priority-level-configuration-reference
  (ds/spec
    {:name ::v1beta1-priority-level-configuration-reference
     :spec v1beta1-priority-level-configuration-reference-data}))

