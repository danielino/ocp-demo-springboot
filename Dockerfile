FROM openjdk:8

RUN apt update  && \
    apt install maven -y

COPY . .

RUN mvn compile && \
    mvn package

COPY target/healthcheck-*SNAPSHOT.jar .

CMD ["java", "-jar", "healthcheck-0.0.1-SNAPSHOT.jar"]
