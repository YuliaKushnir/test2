# Використання базового образу для Java
FROM openjdk:22-jdk-slim

# Встановлення робочої директорії в контейнері
WORKDIR /app

# Копіювання файлів проекту у робочу директорію
COPY . .

# Збирання та запуск проекту
RUN ./mvnw clean package
CMD ["java", "-jar", "target/test2.jar"]
