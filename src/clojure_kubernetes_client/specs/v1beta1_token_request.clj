(ns clojure-kubernetes-client.specs.v1beta1-token-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare v1beta1-token-request-data v1beta1-token-request)
(def v1beta1-token-request-data
  {
   (ds/req :audience) string?
   (ds/opt :expirationSeconds) int?
   })

(def v1beta1-token-request
  (ds/spec
    {:name ::v1beta1-token-request
     :spec v1beta1-token-request-data}))

