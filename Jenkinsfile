pipeline {
  agent any

  tools {
    jdk 'JDK21'   // name from Global Tool Configuration
    maven 'Maven3'    // name from Global Tool Configuration
  }

  environment {
    // Example: GIT_CREDENTIALS = 'github-pat' (credential ID in Jenkins)
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn -B clean test'        // use "bat" on Windows agents: bat 'mvn -B clean test'
      }
    }

    stage('Archive & Results') {
      steps {
        // Archive the cucumber json + xml for visibility
        archiveArtifacts artifacts: 'target/cucumber.json, target/*.xml', fingerprint: true

        // Publish JUnit test results
        junit '**/target/*.xml'
      }
    }

    stage('Publish HTML Report') {
      steps {
        // publishHTML requires 'HTML Publisher Plugin'
        publishHTML ([
          reportDir: 'target/cucumber-html-report', 
          reportFiles: 'index.html', 
          reportName: 'Cucumber HTML Report', 
          allowMissing: true, 
          alwaysLinkToLastBuild: true
        ])
      }
    }
  }

  post {
    always {
      // optional: archive full target
      archiveArtifacts artifacts: 'target/**', allowEmptyArchive: true
    }
    failure {
      mail to: 'you@example.com',
           subject: "Build failed: ${env.JOB_NAME} ${env.BUILD_NUMBER}",
           body: "See ${env.BUILD_URL}"
    }
  }
}
