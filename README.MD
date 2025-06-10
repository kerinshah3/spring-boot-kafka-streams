# How to start with this web-service

### Bring docker up ( This will bring all container up in docker-compose.yml file ) 
docker-compose up -d

### Create a topic
docker exec -it kafka kafka-topics --create --topic ks.error --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

### List all topics
docker exec -it kafka kafka-topics --list --bootstrap-server localhost:9092
