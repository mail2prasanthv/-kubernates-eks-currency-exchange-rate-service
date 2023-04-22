FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=./build/libs/currency-exchange-rate-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} exchange-rate.jar
ENTRYPOINT ["java","-jar","/exchange-rate.jar"]
