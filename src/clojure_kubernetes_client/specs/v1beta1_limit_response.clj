(ns clojure-kubernetes-client.specs.v1beta1-limit-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-queuing-configuration :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-limit-response-data v1beta1-limit-response)
(def v1beta1-limit-response-data
  {
   (ds/opt :queuing) v1beta1-queuing-configuration
   (ds/req :type) string?
   })

(def v1beta1-limit-response
  (ds/spec
    {:name ::v1beta1-limit-response
     :spec v1beta1-limit-response-data}))

