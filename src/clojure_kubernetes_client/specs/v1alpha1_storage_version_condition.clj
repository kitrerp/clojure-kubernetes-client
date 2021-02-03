(ns clojure-kubernetes-client.specs.v1alpha1-storage-version-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]






            )
  (:import (java.io File)))


(declare v1alpha1-storage-version-condition-data v1alpha1-storage-version-condition)
(def v1alpha1-storage-version-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :observedGeneration) int?
   (ds/req :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1alpha1-storage-version-condition
  (ds/spec
    {:name ::v1alpha1-storage-version-condition
     :spec v1alpha1-storage-version-condition-data}))

