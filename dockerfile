FROM openjdk:17
EXPOSE 8080
ADD target/springboot-images-name.jar springboot-images-name.jar
ENTRYPOINT ["java", "-jar", "/springboot-images-name.jar"]
