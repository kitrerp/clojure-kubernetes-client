(ns clojure-kubernetes-client.specs.v1beta1-runtime-class-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare v1beta1-runtime-class-strategy-options-data v1beta1-runtime-class-strategy-options)
(def v1beta1-runtime-class-strategy-options-data
  {
   (ds/req :allowedRuntimeClassNames) (s/coll-of string?)
   (ds/opt :defaultRuntimeClassName) string?
   })

(def v1beta1-runtime-class-strategy-options
  (ds/spec
    {:name ::v1beta1-runtime-class-strategy-options
     :spec v1beta1-runtime-class-strategy-options-data}))

