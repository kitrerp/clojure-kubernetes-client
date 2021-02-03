(ns clojure-kubernetes-client.specs.v1beta1-host-port-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-host-port-range-data v1beta1-host-port-range)
(def v1beta1-host-port-range-data
  {
   (ds/req :max) int?
   (ds/req :min) int?
   })

(def v1beta1-host-port-range
  (ds/spec
    {:name ::v1beta1-host-port-range
     :spec v1beta1-host-port-range-data}))

