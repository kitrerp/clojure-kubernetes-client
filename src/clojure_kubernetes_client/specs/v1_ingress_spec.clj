(ns clojure-kubernetes-client.specs.v1-ingress-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-ingress-backend :refer :all]

            [clojure-kubernetes-client.specs.v1-ingress-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-ingress-tls :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-spec-data v1-ingress-spec)
(def v1-ingress-spec-data
  {
   (ds/opt :defaultBackend) v1-ingress-backend
   (ds/opt :ingressClassName) string?
   (ds/opt :rules) (s/coll-of v1-ingress-rule)
   (ds/opt :tls) (s/coll-of v1-ingress-tls)
   })

(def v1-ingress-spec
  (ds/spec
    {:name ::v1-ingress-spec
     :spec v1-ingress-spec-data}))

