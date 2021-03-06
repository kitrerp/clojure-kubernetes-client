# clojure-kubernetes-client
Clojure client for Kubernetes API

[![Build Status](https://travis-ci.com/exoscale/clojure-kubernetes-client.svg?token=Km7sM6KysgVvrw99sqov&branch=master)](https://travis-ci.com/exoscale/clojure-kubernetes-client)
[![Clojars Project](https://img.shields.io/clojars/v/exoscale/clojure-kubernetes-client.svg)](https://clojars.org/exoscale/clojure-kubernetes-client)

## Usage
### Example
Start kubernetes proxy on `localhost:8080`

The client can be used as follows:
```
(ns example
  (:require [clojure-kubernetes-client.core :as core]
            [clojure-kubernetes-client.api.core-v1 :refer [list-node create-namespace]]))

;; Set end-point for the the client
(core/set-api-context {:base-url "http://localhost:8080"})

;; List nodes
(list-node)

;; Create a new namespace
(create-namespace {:metadata {:name "a"}})
```
## Development
### Update the generated code.
The client is autogenerated using [openapi-generator](https://github.com/OpenAPITools/openapi-generator/) for the API spec fetched from [kubernetes repository](https://github.com/kubernetes/kubernetes).

To modify/upgrade the client to a different kubernetes version, change `KUBERNETES_BRANCH` in [settings](settings) and run `./scripts/clojure.sh` to autogenerate the client-source code.
