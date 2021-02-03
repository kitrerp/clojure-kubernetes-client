(ns clojure-kubernetes-client.specs.v2alpha1-cron-job-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.v2alpha1-job-template-spec :refer :all]
            [clojure-kubernetes-client.specs.string? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.int? :refer :all]
            [clojure-kubernetes-client.specs.boolean? :refer :all]
            )
  (:import (java.io File)))


(declare v2alpha1-cron-job-spec-data v2alpha1-cron-job-spec)
(def v2alpha1-cron-job-spec-data
  {
   (ds/opt :concurrencyPolicy) string?
   (ds/opt :failedJobsHistoryLimit) int?
   (ds/req :jobTemplate) v2alpha1-job-template-spec
   (ds/req :schedule) string?
   (ds/opt :startingDeadlineSeconds) int?
   (ds/opt :successfulJobsHistoryLimit) int?
   (ds/opt :suspend) boolean?
   })

(def v2alpha1-cron-job-spec
  (ds/spec
    {:name ::v2alpha1-cron-job-spec
     :spec v2alpha1-cron-job-spec-data}))

