# canary-java-springboot
Java Spring boot canary for testing REST workflows
- https://github.com/ObrienlabsDev/canary-java-springboot/issues/1
- https://github.com/ObrienlabsDev/canary-java-springboot

# Usage

## Dockerhub
- https://hub.docker.com/repository/docker/obrienlabs/canary-java-springboot/general
## Building locally

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
## Building with Google Cloud Build

<img width="2746" height="1046" alt="Screenshot 2025-12-18 at 14 38 08" src="https://github.com/user-attachments/assets/613a6869-44a1-4960-b4e6-05bd5d7a54f9" />


## URLs

- REST: http://localhost:8888/canary/api/activeId
- {"id" : 2025 }
- Health
- http://localhost:8888/canary/api/health
- HTML/Javascript/Canvas
- http://localhost:8888/canary/




# Lineage
- https://start.spring.io/ use Spring Boot 4
