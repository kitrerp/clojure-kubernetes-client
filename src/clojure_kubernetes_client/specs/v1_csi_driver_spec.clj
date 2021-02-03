(ns clojure-kubernetes-client.specs.v1-csi-driver-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.storage-v1-token-request :refer :all])
  (:import (java.io File)))


(declare v1-csi-driver-spec-data v1-csi-driver-spec)
(def v1-csi-driver-spec-data
  {
   (ds/opt :attachRequired) boolean?
   (ds/opt :fsGroupPolicy) string?
   (ds/opt :podInfoOnMount) boolean?
   (ds/opt :requiresRepublish) boolean?
   (ds/opt :storageCapacity) boolean?
   (ds/opt :tokenRequests) (s/coll-of storage-v1-token-request)
   (ds/opt :volumeLifecycleModes) (s/coll-of string?)
   })

(def v1-csi-driver-spec
  (ds/spec
    {:name ::v1-csi-driver-spec
     :spec v1-csi-driver-spec-data}))

