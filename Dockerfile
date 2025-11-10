# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy Maven build files
COPY target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
