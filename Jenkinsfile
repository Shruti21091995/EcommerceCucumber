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
                    reportDir: 'target/cucumber-reports',      // folder where your report is generated
                    reportFiles: 'cucumber-html-report.html',  // actual report file name
                    reportName: 'Cucumber HTML Report',        // display name in Jenkins
                    keepAll: true,                             // keep past build reports
                    alwaysLinkToLastBuild: true,               // link report from "Last Successful Build"
                    allowMissing: false                        // fail if report is missing
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
