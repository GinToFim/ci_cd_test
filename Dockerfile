# Dockerfile

# jdk 11 Image Start
FROM adoptopenjdk/openjdk11

# 인자 설정 - JAR File
ARG JAR_FILE=build/libs/*.jar

# jar 파일 복제
COPY ${JAR_FILE} app.jar

# 실행 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]
