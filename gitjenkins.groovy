pipeline {
    agent any

    stages {
        stage('reponame') {
            steps {
                echo 'Hey, I am taking code from jenkinsrepo GitHub!'
            }
        }
        stage('HelloWorld') {
            steps {
                echo 'This is my first githubcode for jenkins stage'
            }
        stage('Bye-Bye') {
            steps {
                echo 'This is completed'
            }
        }
    }
}
