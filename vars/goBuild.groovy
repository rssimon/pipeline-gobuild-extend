#!/usr/bin/env groovy

def call(String product='copytest64', String branch='stage', String changeset='latest', String buildType='beta') {
    node {
     stage 'Stage 1'
     gobuild product: "${product}", branch: "${branch}", changeset: "${changset}", buildType: "${buildType}"
    }
}
