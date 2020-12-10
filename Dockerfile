#Added the exposing the port planned to change other items in here to reflect articles you sent after getting
#it to connect with mysql db container. It worked before on my local machine and want create minimal amount of changes
#This was from example on spring-boot website "Docker" example
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]