(ns clojure-kubernetes-client.specs.v1-ingress-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1-ingress :refer :all]

            [clojure-kubernetes-client.specs.v1-list-meta :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-list-data v1-ingress-list)
(def v1-ingress-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1-ingress)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-list-meta
   })

(def v1-ingress-list
  (ds/spec
    {:name ::v1-ingress-list
     :spec v1-ingress-list-data}))

