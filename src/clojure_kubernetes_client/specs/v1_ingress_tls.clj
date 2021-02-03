(ns clojure-kubernetes-client.specs.v1-ingress-tls
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare v1-ingress-tls-data v1-ingress-tls)
(def v1-ingress-tls-data
  {
   (ds/opt :hosts) (s/coll-of string?)
   (ds/opt :secretName) string?
   })

(def v1-ingress-tls
  (ds/spec
    {:name ::v1-ingress-tls
     :spec v1-ingress-tls-data}))

