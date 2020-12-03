# SpringBoot Hello World

## Overview
This project demonstrates a simple HelloWorld SpringBoot application

The reader should have familiarity with the following prior to using the code:
  * Java basic language features
  * The concept of Spring annotations 
  * The concept of RESTful web services

Note that this code is NOT production ready, it exists solely to demonstrate concepts.

## How to run the code
Using IntelliJ, select `File->New ->Project from existing sources`.
Select the `pom.xml` for this project.
Run Maven `clean`.
Run Maven `install`.
Run Maven Plugins -> spring-boot:run

You should now have a SpringBoot RESTful application listening on port 8080.

Using Postman, create a GET request to `http://localhost:8080/hello`. Also set the `Auth` to `Basic Auth` using username=admin and password = nimda

To stop the server, click on the RED button towards the left of the screen.

If you get errors about Tomcat not being able to start due to a port being in use, execute:
`netstat -ano | findstr :8080`
`taskkill /PID <the PID returned above> /F`