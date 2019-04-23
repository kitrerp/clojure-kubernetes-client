(ns kubernetes.specs.v1/stateful-set
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/object-meta :refer :all]
            [kubernetes.specs.v1/stateful-set-spec :refer :all]
            [kubernetes.specs.v1/stateful-set-status :refer :all]
            )
  (:import (java.io File)))


(def v1/stateful-set-data
  {
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/object-meta-spec
   (ds/opt :spec) v1/stateful-set-spec-spec
   (ds/opt :status) v1/stateful-set-status-spec
   })

(def v1/stateful-set-spec
  (ds/spec
    {:name ::v1/stateful-set
     :spec v1/stateful-set-data}))
