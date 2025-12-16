# canary-java-springboot
Java Spring boot canary for testing REST workflows
- https://github.com/ObrienlabsDev/canary-java-springboot/issues/1
- https://github.com/ObrienlabsDev/canary-java-springboot

# Usage

## Dockerhub
- https://hub.docker.com/repository/docker/obrienlabs/canary-java-springboot/general
## building

```
cd canary-java-springboot/src/docker
./build.sh

TAG=0.0.1-arm
# or
TAG=0.0.0-ia64
CONTAINER_IMAGE=canary-java-springboot
docker run --name $CONTAINER_IMAGE -d -p 8888:8080 obrienlabs/$CONTAINER_IMAGE:$TAG 

docker logs -f canary-java-springboot
```
## URLs

- REST: http://localhost:8888/canary/api/activeId
- {"id" : 2025 }
- Health
- http://localhost:8888/canary/api/health
- HTML/Javascript/Canvas
- http://localhost:8888/canary/




# Lineage
- https://start.spring.io/ use Spring Boot 4
