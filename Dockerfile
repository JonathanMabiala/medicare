FROM openjdk:8
EXPOSE 8080
ADD medicare/medicare-rest-api.jar medicare-rest-api.jar
ENTRYPOINT ["java", "-jar", "/medicare-rest-api.jar"]
#This is the Best option