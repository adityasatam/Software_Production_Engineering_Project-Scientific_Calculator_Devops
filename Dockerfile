FROM openjdk:8
MAINTAINER Aditya Satam sasukeaditya236@gmail.com
COPY ./target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]