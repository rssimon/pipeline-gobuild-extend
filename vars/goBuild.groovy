#!/usr/bin/env groovy

def RunGoBuild(product, branch, changeset, buildType="beta")
{
  node {
   stage 'go-build-stage'
   gobuild product: "${product}", branch: "${branch}", changeset: "${changeset}", buildType: "${buildType}"
  }
}

def RunGoBuildWithLatestChange(product, branch, buildType="beta")
{
node {
 stage 'go-build-stage'
 gobuild product: "${product}", branch: "${branch}", changeset: "latest", buildType: "${buildType}"
}
}
