#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    node {
     stage 'go-build-stage'
     gobuild product: "${config.product}", branch: "${config.branch}", changeset: "${config.changeset}", buildType: "${config.buildType}"
    }
}

def RunGoBuildWithSomething(arg)
{
  echo "Hello World GoBuild with Something."
}
