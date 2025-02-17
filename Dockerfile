# Build Stage
FROM amazoncorretto:17 AS builder

# 작업 디렉토리 설정
WORKDIR /app

# Gradle 관련 파일 먼저 복사 (캐시 활용)
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# 실행 권한 부여
RUN chmod +x gradlew

# 소스 코드 복사
COPY src src

# Gradle 빌드 실행 (테스트 제외)
RUN ./gradlew build -x test

# Run Stage (경량화된 실행 환경)
FROM amazoncorretto:17

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일만 복사
COPY --from=builder /app/build/libs/*.jar app.jar

# 컨테이너 실행 시 명령어
CMD ["java", "-jar", "app.jar"]

# 8080 포트 개방
EXPOSE 8080