(ns clojure-kubernetes-client.specs.v1-endpoint-port
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds])
  (:import (java.io File)))


(declare v1-endpoint-port-data v1-endpoint-port)
(def v1-endpoint-port-data
  {
   (ds/opt :appProtocol) string?
   (ds/opt :name) string?
   (ds/req :port) int?
   (ds/opt :protocol) string?
   })

(def v1-endpoint-port
  (ds/spec
    {:name ::v1-endpoint-port
     :spec v1-endpoint-port-data}))

