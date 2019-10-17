#pull base image
FROM openjdk:8-jdk-alpine

#maintainer 
MAINTAINER anil.kumar.external@telefonica.com

#expose port 9081
EXPOSE 9081

#default command
CMD java -jar /product-info-1.0.jar

#copy product-info to docker image
ADD ./target/product-info-1.0.jar /product-info-1.0.jar