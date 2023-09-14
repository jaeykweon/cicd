FROM amazoncorretto:17.0.8-alpine3.18
COPY build/libs/cicd-0.0.1-SNAPSHOT.jar cicd.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "cicd.jar"]
