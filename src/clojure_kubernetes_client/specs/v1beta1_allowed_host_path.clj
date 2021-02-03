(ns clojure-kubernetes-client.specs.v1beta1-allowed-host-path
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds])
  (:import (java.io File)))


(declare v1beta1-allowed-host-path-data v1beta1-allowed-host-path)
(def v1beta1-allowed-host-path-data
  {
   (ds/opt :pathPrefix) string?
   (ds/opt :readOnly) boolean?
   })

(def v1beta1-allowed-host-path
  (ds/spec
    {:name ::v1beta1-allowed-host-path
     :spec v1beta1-allowed-host-path-data}))

