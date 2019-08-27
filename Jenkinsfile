node{
   stage('SCM Checkout'){
     git 'https://github.com/devoxx123/springboot.git'
   }
   
   stage('Compile-Package'){
     def mvnHome = tool name: 'Maven-3', type: 'maven'
     bat "${mvnHome}/bin/mvn package"
   }
  stage('Artifact'){
    archiveArtifacts 'target/*.war'
   }
  stage ('Tomcat Deploy'){
   echo 'deployment started'
     bat '''copy C:\\Users\\SCIIT\\.jenkins\\workspace\\Jenkins-pipeline\\target\\spring.war C:\\Users\\SCIIT\\Downloads\\JenkinsTomcat\\apache-tomcat-9.0.22\\webapps\\'''
   }
  stage('Slack Notification'){
    slackSend baseUrl: 'https://hooks.slack.com/services/', 
    channel: '#jenkins-slack', 
    color: 'good', 
    message: 'Welcome to Jenkins Slack !', 
    teamDomain: 'xpms123.slack.com', 
    tokenCredentialId: 'devoxxId',
    username: 'xpms'
  }
  
}
