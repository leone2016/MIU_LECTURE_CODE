# Stage 1: Build the application
FROM maven:3.9.10-eclipse-temurin-24-alpine AS build
LABEL authors="okalu"
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:24-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar elibraryapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "elibraryapp.jar"]
