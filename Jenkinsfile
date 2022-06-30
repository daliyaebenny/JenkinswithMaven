pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                withMaven(maven:'3.8.6'){
                sh 'mvn clean compile'
                }
            }
        }
        stage('Test'){
                    steps{
                        withMaven(maven:'3.8.6'){
                        sh 'mvn test'
                        }
                    }
        }
        stage('Deploy'){
                    steps{
                        withMaven(maven:'3.8.6'){
                        sh 'mvn deploy'
                        }
                    }
        }
    }

}