(ns clojure-kubernetes-client.specs.v1-deployment-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds])
  (:import (java.io File)))


(declare v1-deployment-condition-data v1-deployment-condition)
(def v1-deployment-condition-data
  {
   (ds/opt :lastTransitionTime) inst?
   (ds/opt :lastUpdateTime) inst?
   (ds/opt :message) string?
   (ds/opt :reason) string?
   (ds/req :status) string?
   (ds/req :type) string?
   })

(def v1-deployment-condition
  (ds/spec
    {:name ::v1-deployment-condition
     :spec v1-deployment-condition-data}))

