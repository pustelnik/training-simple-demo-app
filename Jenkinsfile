#!/usr/bin/env groovy

pipeline {
    agent {
        label 'jdk17'
    }
    tools {
        maven 'maven-3.9.0'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn verify'
                junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
            }
        }
        stage('Build Docker') {
            steps {
                sh 'docker build -t training-demo-app:1.0 .'
            }
        }
    }
}