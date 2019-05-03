FROM fabric8/java-jboss-openjdk8-jdk:1.5.1

ENV JAVA_APP_JAR amazon-crm-party-role.jar
ENV AB_ENABLED off
ENV AB_JOLOKIA_AUTH_OPENSHIFT true
ENV JAVA_OPTIONS -Xmx128m -Djava.security.egd=file:///dev/./urandom

EXPOSE 8080

ADD target/amazon-crm-party-role-management.jar /deployments/
