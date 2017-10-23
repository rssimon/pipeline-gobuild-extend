#!/usr/bin/env groovy

def RunGoBuildWithSomething(product, branch, changeset, buildType)
{
node {
 stage 'go-build-stage'
 gobuild product: "${product}", branch: "${branch}", changeset: "${changeset}", buildType: "${buildType}"
}
}
