# Instructions

## Image build

Maven buid:
```
mvn clean package
```

Docker image build:
```
sudo docker build -t food-outlets .
```

Rodar a aplicação no docker:
```
sudo docker run -p 8080:8080 food-outlets
```

## Endpoint
```
curl --location --request GET 'localhost:8080/app/v1/outlets?city=Denver&maxCost=100'
```