(ns clojure-kubernetes-client.specs.v1beta1-api-service-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]





            )
  (:import (java.io File)))


(declare v1beta1-api-service-condition-data v1beta1-api-service-condition)
(def v1beta1-api-service-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1beta1-api-service-condition
  (ds/spec
    {:name ::v1beta1-api-service-condition
     :spec v1beta1-api-service-condition-data}))

