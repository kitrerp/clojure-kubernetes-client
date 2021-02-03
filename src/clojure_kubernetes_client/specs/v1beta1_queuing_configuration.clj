(ns clojure-kubernetes-client.specs.v1beta1-queuing-configuration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]



            )
  (:import (java.io File)))


(declare v1beta1-queuing-configuration-data v1beta1-queuing-configuration)
(def v1beta1-queuing-configuration-data
  {
   (ds/opt :handSize) int?
   (ds/opt :queueLengthLimit) int?
   (ds/opt :queues) int?
   })

(def v1beta1-queuing-configuration
  (ds/spec
    {:name ::v1beta1-queuing-configuration
     :spec v1beta1-queuing-configuration-data}))

