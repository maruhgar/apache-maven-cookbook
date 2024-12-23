# About

This needs to be used in conjunction with the book [Apache Maven Cookbook](https://www.amazon.in/Apache-Maven-Cookbook-Raghuram-Bharathan/dp/1785286129).

The source is organized in a number of folders corresponding to a specific use case described in the book. For example `project-with-one-jar` will have a working example of a maven project which uses `one-jar` plugin to build the project.

All the examples are working examples.

Coinciding with the tenth anniversary of the publication of the book, I have updated all the dependencies to the latest available as of that.  

I have also ensured that the project works with the latest `3.x` version (`3.9.9`) as of date. 

I have also verified that with the dependency updates, the same code will works with the upcoming maven-4 release, by verifying it with `4.0.0-rc-2` release.

## Pre-requisites

* Java Development Kit (JDK) - it is preferable to use the latest LTS version (`jdk-21`) as of date.  While `maven 3` works with `java 8` and above `maven 4` will only work with `java 17` and above.   However, `maven` can build projects of `lower` jdk using appropriate toolkits.

* Set JAVA_HOME to the location where JDK is installed.  This varies based on the Operating System.  The steps for this is detailed in the book

## Running

From the parent folder, run `mvn clean package` to clean and build all the submodules.
