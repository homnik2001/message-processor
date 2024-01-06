#Build for AMD64
FROM openjdk:17-oracle
ARG JAR_FILE=target/message-processor-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]