# JavaSpring

build:

```bash
$ mvn clean install
```
build (skip tests):

```bash
$ mvn -Dmaven.test.skip=true clean install
```

run:

```bash
$ mvn spring-boot:run -Dspring-boot.run.profiles=development