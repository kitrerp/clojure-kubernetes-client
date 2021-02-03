(ns clojure-kubernetes-client.specs.v1beta1-endpoint-conditions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]



            )
  (:import (java.io File)))


(declare v1beta1-endpoint-conditions-data v1beta1-endpoint-conditions)
(def v1beta1-endpoint-conditions-data
  {
   (ds/opt :ready) boolean?
   (ds/opt :serving) boolean?
   (ds/opt :terminating) boolean?
   })

(def v1beta1-endpoint-conditions
  (ds/spec
    {:name ::v1beta1-endpoint-conditions
     :spec v1beta1-endpoint-conditions-data}))

