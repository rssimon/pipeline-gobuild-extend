#!/usr/bin/env groovy

def RunGoBuild(Map gobuild_params = [:])
{
  node {
   stage 'go-build-stage'
   gobuild product: "${gobuild_params.product ?: 'copytest64'}", branch: "${gobuild_params.branch ?: 'stage'}", changeset: "${gobuild_params.changeset ?: 'latest'}", buildType: "${gobuild_params.buildType ?: 'beta'}"
  }
}

def RunGoBuildWithLatestChange(product, branch, buildType="beta")
{
node {
 stage 'go-build-stage'
 gobuild product: "${gobuild_params.product ?: 'copytest64'}", branch: "${gobuild_params.branch ?: 'stage'}", changeset: "latest", buildType: "${gobuild_params.buildType ?: 'beta'}"
}
}
