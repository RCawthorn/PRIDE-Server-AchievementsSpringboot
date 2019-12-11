pipeline {
    agent any
    environment{ 
    VERSION = readMavenPom().getVersion()
    }
    

    stages {
        stage("version"){
            steps{
            echo "${VERSION}"
            }

        }
        stage('Testing') {
            steps {
			    sh 'mvn test'
				echo"Testing"

                }
            }
        stage('Build') {
            steps { sh 'mvn package -DskipTests'
		echo "Build"
                }
            }
        stage('Deploy') {
            steps {
		echo "Deploy"
            }
        }
    
stage('Testing Environment') {
            steps {
                echo "hello"
            }
        }
      stage('Staging') {
           when{
                    expression{
                        env.BRANCH_NAME == 'developer'
                        
                    }
                }
            steps {
                echo "Dev"
            }
        }
      stage('Production') {
          when{
                    expression{
                        env.BRANCH_NAME == 'master'
                    }
                }
            steps {
                
                echo "production"
            }
        }
    }

}