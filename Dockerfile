
FROM openjdk:11
VOLUME /tmp
EXPOSE 1489
ADD target/*.jar os_lab4.jar
ENTRYPOINT ["java","-jar","/os_lab4.jar"]
