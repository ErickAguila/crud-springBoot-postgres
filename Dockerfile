FROM maven:3.8.3-openjdk-17
WORKDIR /app
RUN mkdir -p /root/.m2/repository
COPY . .
RUN mvn install
CMD ["mvn", "spring-boot:run"]

# Comando para correr docker
# Construir imagen docker -> sudo docker build -t crud-postgres .
# Correr docker -> sudo docker run --rm --name crud-postgres -dp 8080:8080 crud-postgres