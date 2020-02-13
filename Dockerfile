FROM tomcat:8.0.20-jre8

# Dummy text to test 

COPY target/spring*.war /usr/local/tomcat/webapps/spring-app.war
