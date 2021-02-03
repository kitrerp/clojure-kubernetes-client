(ns clojure-kubernetes-client.specs.v1-overhead
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            )
  (:import (java.io File)))


(declare v1-overhead-data v1-overhead)
(def v1-overhead-data
  {
   (ds/opt :podFixed) (s/map-of string? string?)
   })

(def v1-overhead
  (ds/spec
    {:name ::v1-overhead
     :spec v1-overhead-data}))

