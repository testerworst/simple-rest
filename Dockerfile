FROM openjdk:17
EXPOSE 8085
ADD target/simple-rest.jar  simple-rest.jar
ENTRYPOINT ["java", "-jar", "/simple-rest.jar"]