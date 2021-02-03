(ns clojure-kubernetes-client.specs.v1beta1-se-linux-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.v1-se-linux-options :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-se-linux-strategy-options-data v1beta1-se-linux-strategy-options)
(def v1beta1-se-linux-strategy-options-data
  {
   (ds/req :rule) string?
   (ds/opt :seLinuxOptions) v1-se-linux-options
   })

(def v1beta1-se-linux-strategy-options
  (ds/spec
    {:name ::v1beta1-se-linux-strategy-options
     :spec v1beta1-se-linux-strategy-options-data}))

