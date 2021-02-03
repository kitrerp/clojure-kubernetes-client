(ns clojure-kubernetes-client.specs.v1beta1-csi-driver-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-token-request :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-csi-driver-spec-data v1beta1-csi-driver-spec)
(def v1beta1-csi-driver-spec-data
  {
   (ds/opt :attachRequired) boolean?
   (ds/opt :fsGroupPolicy) string?
   (ds/opt :podInfoOnMount) boolean?
   (ds/opt :requiresRepublish) boolean?
   (ds/opt :storageCapacity) boolean?
   (ds/opt :tokenRequests) (s/coll-of v1beta1-token-request)
   (ds/opt :volumeLifecycleModes) (s/coll-of string?)
   })

(def v1beta1-csi-driver-spec
  (ds/spec
    {:name ::v1beta1-csi-driver-spec
     :spec v1beta1-csi-driver-spec-data}))

