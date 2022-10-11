FROM java:8-jdk-alpine
COPY ./target/food-outlets.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch food-outlets.jar'
ENTRYPOINT ["java","-jar","food-outlets.jar"]