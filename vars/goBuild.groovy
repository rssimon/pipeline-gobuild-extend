#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    node {
     stage 'Stage 1'
     gobuild product: "${config.product}", branch: 'stage', changeset: 'latest', buildType: 'beta'
    }
}
