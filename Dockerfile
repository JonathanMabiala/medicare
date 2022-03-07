FROM openjedk:8
EXPOSE 8080
ADD target/medicar-rest-api.jar medicar-rest-api.jar
ENTRYPOINT ["java", "-jar", "/medicar-rest-api.jar"]