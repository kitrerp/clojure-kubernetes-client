(ns clojure-kubernetes-client.specs.v1-ephemeral-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]

            [clojure-kubernetes-client.specs.v1-persistent-volume-claim-template :refer :all]
            )
  (:import (java.io File)))


(declare v1-ephemeral-volume-source-data v1-ephemeral-volume-source)
(def v1-ephemeral-volume-source-data
  {
   (ds/opt :readOnly) boolean?
   (ds/opt :volumeClaimTemplate) v1-persistent-volume-claim-template
   })

(def v1-ephemeral-volume-source
  (ds/spec
    {:name ::v1-ephemeral-volume-source
     :spec v1-ephemeral-volume-source-data}))

