pipeline {
    agent any

    tools {
        jdk 'JDK11'      // or your configured JDK name
        maven 'Maven3'   // or your configured Maven name
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven tests...'
                bat 'mvn clean test'
            }
        }

        stage('Publish Report') {
            steps {
                echo 'Publishing Cucumber HTML report...'
                publishHTML([
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'index.html',          // ✅ your Cucumber HTML report file
                    reportName: 'Cucumber HTML Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: true
                ])
            }
        }
    } // ✅ closes 'stages' block

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
} // ✅ closes 'pipeline' block
