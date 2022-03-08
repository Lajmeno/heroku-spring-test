FROM openjdk:17

VOLUME /tmp
ARG JAR_FILE


MAINTAINER Abdullah I.

ADD target/docker-spring-test-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=docker","-jar","/app.jar"]