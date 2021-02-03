(ns clojure-kubernetes-client.specs.v1-persistent-volume-claim-template
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1-persistent-volume-claim-template-data v1-persistent-volume-claim-template)
(def v1-persistent-volume-claim-template-data
  {
   (ds/opt :metadata) v1-object-meta
   (ds/req :spec) v1-persistent-volume-claim-spec
   })

(def v1-persistent-volume-claim-template
  (ds/spec
    {:name ::v1-persistent-volume-claim-template
     :spec v1-persistent-volume-claim-template-data}))

