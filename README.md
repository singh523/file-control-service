# file-control-service

#### Introduction
file-control-service is a spring boot microservice which will expose file control rest services. 

#### prerequisites

* Install Java 1.8, docker (Optional) and setup JAVA_HOME in environment variables
* Install Maven and setup M2_HOME in environment variables

#### Local Setup
Clone the repository from the below URL and run ```mvn clean package``` to create a jar file
```
git clone https://github.com/singh523/file-control-service.git
cd file-control-service
mvn clean install
mvn spring-boot:run
```
If you have you have installed docker, you can run this service as a docker container, follow the below steps to build & run 

```$xslt
docker build -t singh523/file-control-service .
docker run -p 8080:8080 singh523/file-control-service
``` 

#### Testing
 You can test the service with the postman
 
 ##### Service Health check:
 ```
curl -X GET \
  http://localhost:8080/test \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 8ffce83a-9f90-4dd4-06d6-86bdc9f335b1'
 ``` 
 
 ##### File Upload:
 
 * Create a Post request with the URL http://localhost:8080/uploadFile
 
 ```
curl -X POST \
  http://localhost:8080/uploadFile \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -H 'postman-token: 7cba790e-6072-216d-7ed8-c58bd1562718' \
  -F file=@12534289.pdf

```
 
 ![Screenshot](https://github.com/singh523/file-control-service/blob/master/src/test/resources/postman_test1.png)

* Response will be returned with the download URL.
* File Download service endpoint is exposed and you can use the download URL to download the file. 

