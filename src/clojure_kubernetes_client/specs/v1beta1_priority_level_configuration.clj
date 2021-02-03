(ns clojure-kubernetes-client.specs.v1beta1-priority-level-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-spec :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-priority-level-configuration-status :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-priority-level-configuration-data v1beta1-priority-level-configuration)
(def v1beta1-priority-level-configuration-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1beta1-priority-level-configuration-spec
   (ds/opt :status) v1beta1-priority-level-configuration-status
   })

(def v1beta1-priority-level-configuration
  (ds/spec
    {:name ::v1beta1-priority-level-configuration
     :spec v1beta1-priority-level-configuration-data}))

