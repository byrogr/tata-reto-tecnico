FROM eclipse-temurin:21
RUN mkdir /opt/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /opt/app/
CMD ["java", "-jar", "/opt/app/tata-reto-tecnico-1.0.0.jar"]