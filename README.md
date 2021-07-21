# spring-config-client
Spring config client


add config client starter in pom file
create spring-config-client.properties and spring-config-client-dev.properties to git server and move all application.properties to these files as per requirement
change application.properties to bootstrap.properties

spring.application.name=spring-config-client
spring.cloud.config.uri=http://localhost:8888

Now in logs it will get port no from configuration file.

my files have this property

spring-config-client-dev.properties
server.port=8123

spring-config-client.properties
server.port=8122



we can also set profile 

#spring.profiles.active=dev

This will match <application-name>-<profile>.properties automaticall


