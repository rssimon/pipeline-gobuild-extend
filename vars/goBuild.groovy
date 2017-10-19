#!/usr/bin/env groovy

def call() {
node {
 stage 'Stage 1'
 gobuild product: 'copytest64', branch: 'stage', changeset: 'latest', buildType: 'beta'
}
}
