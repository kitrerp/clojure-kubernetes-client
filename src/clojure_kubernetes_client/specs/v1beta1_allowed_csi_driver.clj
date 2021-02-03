(ns clojure-kubernetes-client.specs.v1beta1-allowed-csi-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            )
  (:import (java.io File)))


(declare v1beta1-allowed-csi-driver-data v1beta1-allowed-csi-driver)
(def v1beta1-allowed-csi-driver-data
  {
   (ds/req :name) string?
   })

(def v1beta1-allowed-csi-driver
  (ds/spec
    {:name ::v1beta1-allowed-csi-driver
     :spec v1beta1-allowed-csi-driver-data}))

