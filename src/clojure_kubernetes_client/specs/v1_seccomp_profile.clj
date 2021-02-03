(ns clojure-kubernetes-client.specs.v1-seccomp-profile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]


            )
  (:import (java.io File)))


(declare v1-seccomp-profile-data v1-seccomp-profile)
(def v1-seccomp-profile-data
  {
   (ds/opt :localhostProfile) string?
   (ds/req :type) string?
   })

(def v1-seccomp-profile
  (ds/spec
    {:name ::v1-seccomp-profile
     :spec v1-seccomp-profile-data}))

