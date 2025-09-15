
FROM maven:3.9.6-eclipse-temurin-22-jammy AS build
COPY . .
FROM openjdk:17 AS builder
COPY --from=build /target/spring-azure.jar spring-azure.jar
EXPOSE 1199
ENTRYPOINT ["java", "-jar", "spring-azure.jar"]

USER nobody
