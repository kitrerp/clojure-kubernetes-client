(ns clojure-kubernetes-client.specs.v1-pod-ip
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1-pod-ip-data v1-pod-ip)
(def v1-pod-ip-data
  {
   (ds/opt :ip) string?
   })

(def v1-pod-ip
  (ds/spec
    {:name ::v1-pod-ip
     :spec v1-pod-ip-data}))

