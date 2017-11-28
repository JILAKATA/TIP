#!/bin/bash
# Script Description:
# Creates directory CS498/mp1/junit/4.12
# Downloads JUnit 4.12 to the new directory
# Creates directory CS498/mp1/org/hamcrest-core/1.3
# Downloads Hamcrest Core 1.3 to the new directory

mkdir -p junit/4.12/
wget  http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
mv junit-4.12.jar ./junit/4.12
mkdir -p org/hamcrest/hamcrest-core/1.3/
wget http://central.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
mv hamcrest-core-1.3.jar ./org/hamcrest/hamcrest-core/1.3/

# Create a directory target/classes/
# Compile MyStack.java, MyStackDemo.java
# Place .class files into the new directory
mkdir -p target/classes
javac -d ./target/classes/ -sourcepath ./ ./MyStack.java ./MyStackDemo.java

# Create directory target/test-classes/
# Compile Test sources
# Place compiled .class files in the new directory
mkdir target/test-classes
javac -cp ./junit/4.12/junit-4.12.jar -d ./target/test-classes/ -sourcepath ./ ./MyStackTest.java
rm ./target/test-classes/MyStack.class
