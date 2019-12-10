from anapsix/alpine-java

copy target/Swagger2Word-exec.jar   /opt/
expose 8090
entrypoint [ "java","-jar","/opt/Swagger2Word-exec.jar" ]

