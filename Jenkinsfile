pipeline {
    
    agent any
    
    environment {
        DATE = new Date().format('yy.M')
        TAG = "${DATE}.${BUILD_NUMBER}"
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    docker.build("giardinapaolo64/java-example:${TAG}")
                }
            }
        }
	    stage('Pushing Docker Image to Dockerhub') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
                        docker.image("giardinapaolo64/java-example:${TAG}").push()
                        docker.image("giardinapaolo64/java-example:${TAG}").push("latest")
                    }
                }
            }
        }
        /*
        stage('Deploy'){
            steps {
                sh "docker stop giardinapaolo64/java-example | true"
                sh "docker rm giardinapaolo64/java-example | true"
                sh "docker run --name giardinapaolo64/java-example -d -p 8000:8080 giardinapaolo64/java-example:${TAG}"
            }
        }
        */
    }
}