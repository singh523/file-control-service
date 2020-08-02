From openjdk:8
copy ./target/file-control-service-0.0.1-SNAPSHOT.jar file-control-service-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","file-control-service-0.0.1-SNAPSHOT.jar"]
