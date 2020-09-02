FROM openjdk:13
VOLUME "/tmp"
EXPOSE 8082
ADD ./target/transaction-1.0.jar /transaction.jar
ENTRYPOINT [ "java","-jar","/transaction.jar" ]