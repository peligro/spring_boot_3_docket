# imagen modelo
FROM eclipse-temurin:21.0.3_9-jdk

#configurar puerto (sólo informativo)
EXPOSE 8080

#definir directorio raiz de nuestro contenedor
WORKDIR /root

#coipar y pegar archivos dentro del contenedor
COPY ./pom.xml /root
#maven embebido
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

# descargar las dependencias
RUN ./mvnw dependency:go-offline

# copiar y pegar el código fuente dentro del contenedor
COPY ./src /root/src

# construir la imagen de la aplicación
RUN ./mvnw clean install -DskipTests

# levantar la aplicación cuando el contenedor inicie
ENTRYPOINT ["java","-jar","/root/target/spring_1-0.0.1-SNAPSHOT.jar"]