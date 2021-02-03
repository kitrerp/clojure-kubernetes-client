(ns clojure-kubernetes-client.specs.v1beta1-group-subject
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-group-subject-data v1beta1-group-subject)
(def v1beta1-group-subject-data
  {
   (ds/req :name) string?
   })

(def v1beta1-group-subject
  (ds/spec
    {:name ::v1beta1-group-subject
     :spec v1beta1-group-subject-data}))

