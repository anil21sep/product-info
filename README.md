# product-info

Hello World sample shows how to deploy SpringBoot RESTful web service application with Docker

Prerequisite
Installed: Docker, Java 1.8, Maven 3.x

Steps

Clone source code from git
$  git clone https://github.com/anil21sep/product-info.git .

Build project with Maven
$ mvn clean install

Build Docker image
$ docker build -t="product-info" .
Note:if you run this command for first time it will take some time in order to download base image from DockerHub

Run Docker image
$ docker run -p 9081:9081 -it --rm product-info
Test application
first you need to find ContainerId of the running Docker image

$ docker ps
you can find ContainerId in a row where IMAGE column contains 'product-info' phrase

then you need to find IP address of the running Docker image

$ docker inspect --format '{{ .NetworkSettings.IPAddress }}' [ContainerId]
now test application

$ curl [IPAddress]:9081
the respone should be

