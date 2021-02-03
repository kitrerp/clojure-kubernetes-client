(ns clojure-kubernetes-client.specs.v1beta1-run-as-group-strategy-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-id-range :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-run-as-group-strategy-options-data v1beta1-run-as-group-strategy-options)
(def v1beta1-run-as-group-strategy-options-data
  {
   (ds/opt :ranges) (s/coll-of v1beta1-id-range)
   (ds/req :rule) string?
   })

(def v1beta1-run-as-group-strategy-options
  (ds/spec
    {:name ::v1beta1-run-as-group-strategy-options
     :spec v1beta1-run-as-group-strategy-options-data}))

