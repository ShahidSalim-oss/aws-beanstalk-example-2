FROM maven:3.6.0-jdk-11 AS MAVEN_BUILD
RUN mkdir -p /build/
COPY pom.xml build/pom.xml
COPY src /build/src/
WORKDIR /build
RUN mvn package install -DskipTests
FROM openjdk:11
COPY --from=MAVEN_BUILD /build/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 