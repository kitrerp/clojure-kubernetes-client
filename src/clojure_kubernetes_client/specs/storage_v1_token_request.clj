(ns clojure-kubernetes-client.specs.storage-v1-token-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare storage-v1-token-request-data storage-v1-token-request)
(def storage-v1-token-request-data
  {
   (ds/req :audience) string?
   (ds/opt :expirationSeconds) int?
   })

(def storage-v1-token-request
  (ds/spec
    {:name ::storage-v1-token-request
     :spec storage-v1-token-request-data}))

