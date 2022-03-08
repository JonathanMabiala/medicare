FROM openjedk:8
EXPOSE 8080
ADD target/medicare-rest-api.jar medicare-rest-api.jar
ENTRYPOINT ["java", "-jar", "/medicare-rest-api.jar"]