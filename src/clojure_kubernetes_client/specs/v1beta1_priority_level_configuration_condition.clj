(ns clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.inst? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-priority-level-configuration-condition-data v1beta1-priority-level-configuration-condition)
(def v1beta1-priority-level-configuration-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/opt :status) string?
   (ds/opt :type) string?
   })

(def v1beta1-priority-level-configuration-condition
  (ds/spec
    {:name ::v1beta1-priority-level-configuration-condition
     :spec v1beta1-priority-level-configuration-condition-data}))

