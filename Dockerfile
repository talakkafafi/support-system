# Use a slim JDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the build jar into the container
COPY target/support-system-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]

