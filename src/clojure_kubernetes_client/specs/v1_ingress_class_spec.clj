(ns clojure-kubernetes-client.specs.v1-ingress-class-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1-typed-local-object-reference :refer :all]
            )
  (:import (java.io File)))


(declare v1-ingress-class-spec-data v1-ingress-class-spec)
(def v1-ingress-class-spec-data
  {
   (ds/opt :controller) string?
   (ds/opt :parameters) v1-typed-local-object-reference
   })

(def v1-ingress-class-spec
  (ds/spec
    {:name ::v1-ingress-class-spec
     :spec v1-ingress-class-spec-data}))

