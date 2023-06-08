Compile jar with command below

```
docker run -it --rm --name maven-test-builder -v "$(pwd)":/usr/src/app -w /usr/src/app maven:3.8-jdk-8 mvn clean install -DskipTests
```

build docker image with command below:

```
docker build . -t hello-world-spring
```