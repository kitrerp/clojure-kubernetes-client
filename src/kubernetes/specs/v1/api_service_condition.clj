(ns kubernetes.specs.v1/api-service-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/api-service-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1/api-service-condition-spec
  (ds/spec
    {:name ::v1/api-service-condition
     :spec v1/api-service-condition-data}))
