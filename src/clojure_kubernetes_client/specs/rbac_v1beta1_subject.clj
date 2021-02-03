(ns clojure-kubernetes-client.specs.rbac-v1beta1-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]




            )
  (:import (java.io File)))


(declare rbac-v1beta1-subject-data rbac-v1beta1-subject)
(def rbac-v1beta1-subject-data
  {
   (ds/opt :apiGroup) string?
   (ds/req :kind) string?
   (ds/req :name) string?
   (ds/opt :namespace) string?
   })

(def rbac-v1beta1-subject
  (ds/spec
    {:name ::rbac-v1beta1-subject
     :spec rbac-v1beta1-subject-data}))

