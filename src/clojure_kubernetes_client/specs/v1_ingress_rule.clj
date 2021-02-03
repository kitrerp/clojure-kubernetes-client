(ns clojure-kubernetes-client.specs.v1-ingress-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1-http-ingress-rule-value :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-rule-data v1-ingress-rule)
(def v1-ingress-rule-data
  {
   (ds/opt :host) string?
   (ds/opt :http) v1-http-ingress-rule-value
   })

(def v1-ingress-rule
  (ds/spec
    {:name ::v1-ingress-rule
     :spec v1-ingress-rule-data}))

