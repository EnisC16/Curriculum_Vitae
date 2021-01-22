FROM openjdk:14
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cv_backend.jar
ENTRYPOINT ["java","-jar","/cv_backend.jar"]