(ns clojure-kubernetes-client.specs.v1beta1-endpoint-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-endpoint-port-data v1beta1-endpoint-port)
(def v1beta1-endpoint-port-data
  {
   (ds/opt :appProtocol) string?
   (ds/opt :name) string?
   (ds/opt :port) int?
   (ds/opt :protocol) string?
   })

(def v1beta1-endpoint-port
  (ds/spec
    {:name ::v1beta1-endpoint-port
     :spec v1beta1-endpoint-port-data}))

