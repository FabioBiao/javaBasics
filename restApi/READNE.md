
Dependencies:
spring web
spring data jdbc
postgresSql driver

https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.6&packaging=jar&jvmVersion=11&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jdbc,postgresql

http://localhost:8080/

## endpoints:
getStudents: http://localhost:8080/api/v1/student
addStudent post : http://localhost:8080/api/v1/student
delete student: http://localhost:8080/api/v1/student/3
update student put : http://localhost:8080/api/v1/student/1

## start server in specific port
java -jar .\demo-0.0.1-SNAPSHOT.jar --server.port=8081
