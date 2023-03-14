# GraalVmSpringBootApp

## Description 
This Application is a GraalVM demo application.
This is a practice project where we use GraalVM with spring boot and maven to create executable native image.

## Pre-requisite
Maven
Java 17
GraalVM 

## Steps to build native image
Download Graalvm `sdk install java 22.3.1.r17-grl`
Use the java version in the Terminal `sdk use java 22.3.1.r17-grl `
Create a executable native image with maven using `mvn -Pnative clean package` (This might take few minutes)
This will create native image in target folder to execute the image `/target/graalAot`
To check the size of the executable use `du -hs graalAot`

## Advantage of using Graal VM native image
There are many advantages of using the graalvm native images. Such as lower memory foot print, quick start up time. 
Precompiled classes. Less cloud cost since it consume less resources. 
