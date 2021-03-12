FROM openjdk:8
MAINTAINER Aditya Satam sasukeaditya236@gmail.com
COPY ./target/calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-devops-1.0-SNAPSHOT.jar", "calculator.Calculator"]