#!/usr/bin/env groovy

def call() {
  gobuild product: 'copytest64', branch: 'stage', changeset: 'latest', buildType: 'beta'
}
