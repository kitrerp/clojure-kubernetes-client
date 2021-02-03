(ns clojure-kubernetes-client.specs.v1beta1-allowed-flex-volume
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            )
  (:import (java.io File)))


(declare v1beta1-allowed-flex-volume-data v1beta1-allowed-flex-volume)
(def v1beta1-allowed-flex-volume-data
  {
   (ds/req :driver) string?
   })

(def v1beta1-allowed-flex-volume
  (ds/spec
    {:name ::v1beta1-allowed-flex-volume
     :spec v1beta1-allowed-flex-volume-data}))

