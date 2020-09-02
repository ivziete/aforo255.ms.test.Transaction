#!/bin/bash
echo ============================================================
echo Generate JAR
echo ============================================================
mvn clean package -DskipTests
echo ============================================================
echo BUILD and PUSH Project to Docker
echo ============================================================
docker rm -f app-transactional
docker build -t ivancondori/app-transactional:1.0 .
docker run -p 8082:8082 --name app-transactional --network aforo255-test -d ivancondori/app-transactional:1.0
echo ============================================================
echo End Process
echo ============================================================