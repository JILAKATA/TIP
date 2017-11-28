#!bin/bash/
# Call this from mystacktest directory
# Assumes that there is a testInProgress-client-1.5-SNAPSHOT.jar
# file in that directory
mvn install:install-file -Dfile=./resources/testInProgress-client-1.5-SNAPSHOT.jar -DgroupId=org.jenkins-ci.plugins -DartifactId=testInProgress-client -Dversion=1.5 -Dpackaging=jar
