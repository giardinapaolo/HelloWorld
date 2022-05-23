FROM alpine:latest
WORKDIR /root/test
ADD target/HelloWorld.jar /root/test
RUN apk --update add openjdk8-jre
ENV CLASSPATH=HelloWorld.jar:${CLASSPATH}
CMD ["java", "it.sincrono.ServiceApplication"]