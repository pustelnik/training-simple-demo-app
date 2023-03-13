#!/usr/bin/env groovy

library identifier: 'training-simple-shared-library.git@main', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'https://github.com/pustelnik/training-simple-shared-library.git',
   credentialsId: 'my-private-key'])

mavenBuild {
    build=[
        node: 'jdk17',
        runTests: true,
        buildDocker: true,
        trivyScan: false
    ]
}