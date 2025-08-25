# My Shared Library

This is a simple Jenkins Shared Library with a `bounds` function.

## Usage in Jenkinsfile
```groovy
@Library('my-shared-lib') _

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    def safeValue = bounds(150, 0, 100)
                    echo "Safe value: ${safeValue}"
                }
            }
        }
    }
}
```
