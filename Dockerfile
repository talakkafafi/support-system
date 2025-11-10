# Dockerfile
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the Spring Boot jar
COPY target/support-system-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
