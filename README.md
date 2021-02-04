# Website
Personal website built with the Play Framework.

Run `./gradlew tasks` to see a list of tasks that you can execute.

## Lint
```shell
./gradlew spotlessApply
```

## Test
```shell
./gradlew test
```

## Build
### Build and Test
```shell
./gradlew build
```

### Continuous
```shell
./gradlew runPlay
```

## Docker Build
### Local Docker Daemon
```shell
./gradlew jibDockerBuild
```

### ECR
```shell
aws ecr get-login-password --profile replace-me --region replace-me | docker login --username AWS --password-stdin 477016018110.dkr.ecr.us-west-2.amazonaws.com/website && ./gradlew jib
```

## Deploy
```shell
aws eks update-kubeconfig --region replace-me --name replace-me --profile replace-me && kubectl apply -f k8s/application.yml
```

## Ports of interest
| port  | application
| ----- | ---
| 9000  | play application
| 9095  | prometheus metrics
