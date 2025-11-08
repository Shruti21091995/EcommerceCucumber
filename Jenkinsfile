pipeline {
    agent any

    tools {
        jdk 'JDK11'      // or whatever your configured JDK name is
        maven 'Maven3'   // or whatever your configured Maven name is
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
                    reportDir: 'target/cucumber-html-report',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber Report',
                    allowMissing: true
                ])
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
