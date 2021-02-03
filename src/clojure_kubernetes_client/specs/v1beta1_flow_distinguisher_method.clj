(ns clojure-kubernetes-client.specs.v1beta1-flow-distinguisher-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            )
  (:import (java.io File)))


(declare v1beta1-flow-distinguisher-method-data v1beta1-flow-distinguisher-method)
(def v1beta1-flow-distinguisher-method-data
  {
   (ds/req :type) string?
   })

(def v1beta1-flow-distinguisher-method
  (ds/spec
    {:name ::v1beta1-flow-distinguisher-method
     :spec v1beta1-flow-distinguisher-method-data}))

