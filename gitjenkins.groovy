pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('World') {
            steps {
                echo 'This is my customized stage'
            }
        }
    }
}
