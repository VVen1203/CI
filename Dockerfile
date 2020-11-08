FROM openjdk:8
COPY /root/.jenkins/workspace/tuboxuxu/student/target/ /usr/src/myapp
WORKDIR /usr/src/myapp
RUN nohup java -jar /usr/src/myapp/student-0.0.1-SNAPSHOT.jar > /usr/src/myapp/nohup.out &
