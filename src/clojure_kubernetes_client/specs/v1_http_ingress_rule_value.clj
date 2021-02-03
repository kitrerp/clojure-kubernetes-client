(ns clojure-kubernetes-client.specs.v1-http-ingress-rule-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-http-ingress-path :refer :all]
            )
  (:import (java.io File)))


(declare v1-http-ingress-rule-value-data v1-http-ingress-rule-value)
(def v1-http-ingress-rule-value-data
  {
   (ds/req :paths) (s/coll-of v1-http-ingress-path)
   })

(def v1-http-ingress-rule-value
  (ds/spec
    {:name ::v1-http-ingress-rule-value
     :spec v1-http-ingress-rule-value-data}))

