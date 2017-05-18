# Eureka! Clinical Analytics REST API Client
[Atlanta Clinical and Translational Science Institute (ACTSI)](http://www.actsi.org), [Emory University](http://www.emory.edu), Atlanta, GA

## What does it do?
It is a library for accessing Eureka! Clinical Analytics REST APIs from Java applications. It provides two REST API clients:

EurekaClient.java: for web clients to call Eureka REST APIs via the eureka-webapp proxy.
EurekaProxyClient.java: for Java applications to call Eureka REST APIs directly using eureka-service.

## Version 3.0 development series
Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eureka-client/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eureka-client)

We are synchronizing the version number with the rest of Eureka! Clinical Analytics.

## Version history
### Version 1.1.1
This is the first released version of the client. Versions 1.0 and 1.1 had issues with the `*ProxyClient` not working.

## Build requirements
* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

## Runtime requirements
* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)

## Building it
The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

## Maven dependency
```
<dependency>
    <groupId>org.eurekaclinical</groupId>
    <artifactId>eureka-client</artifactId>
    <version>version</version>
</dependency>
```

## Developer documentation
* [Javadoc for latest development release](http://javadoc.io/doc/org.eurekaclinical/eureka-client) [![Javadocs](http://javadoc.io/badge/org.eurekaclinical/eureka-client.svg)](http://javadoc.io/doc/org.eurekaclinical/eureka-client)

## Getting help
Feel free to contact us at help@eurekaclinical.org.
