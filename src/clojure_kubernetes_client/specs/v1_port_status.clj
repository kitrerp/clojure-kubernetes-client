(ns clojure-kubernetes-client.specs.v1-port-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-port-status-data v1-port-status)
(def v1-port-status-data
  {
   (ds/opt :error) string?
   (ds/req :port) int?
   (ds/req :protocol) string?
   })

(def v1-port-status
  (ds/spec
    {:name ::v1-port-status
     :spec v1-port-status-data}))

