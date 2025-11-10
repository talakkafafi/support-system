# Dockerfile
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the Spring Boot jar
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
