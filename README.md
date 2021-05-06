# Java In A Docker:

Exercise to practice the deployment of a JAR file in a Docker image.


## Dockerfile:
```dockerfile
# First stage of the build, we use a 3.6.1 maven slim parent image.
FROM maven:3.6.1-jdk-11-slim AS mvn_build

# Copy the src and pom.
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

# We execute mvn package to get the .jar
RUN mvn -f /usr/src/app/pom.xml clean package

# On the second stage of the build we use a openjdk11-jre slim buster image.
FROM openjdk:11-jre-slim-buster

MAINTAINER Carlos Uriel <cdominguez@cifpfbmoll.eu>

# We copy only the artifact we need from the first stage(mvn_build).
COPY --from=mvn_build /usr/src/app/target/romansGoHome-1.0-SNAPSHOT.jar /usr/app/romansGoHome-1.0-SNAPSHOT.jar

# We indicate the por on wich the container listens for connections.
EXPOSE 8080

# Specify the user to the container.
ENV USER=appuser
RUN adduser \
    --disabled-password \
    --home "$(pwd)" \
    --no-create-home \
    "$USER"
USER appuser

# We set the image main command.
ENTRYPOINT ["java","-jar","/usr/app/romansGoHome-1.0-SNAPSHOT.jar"]
```