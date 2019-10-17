#pull base image
FROM openjdk:8-jdk-alpine

#maintainer 
MAINTAINER anil.kumar.external@telefonica.com

#expose port 9081
EXPOSE 9081

#copy product-info to docker image
ADD target/product-info.jar product-info.jar

#default command
ENTRYPOINT ["java","-jar","product-info.jar"]

