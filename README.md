# Processing Java

This repository contains a Maven Archetype for creating Processing projects using Maven.

The archetype name is "CS1OOP Bootcamp Java Project" (see pom.xml).  Once installed you can find it in the local catalog under the name `processing_java`.

## Install with `mvn`
Download the project, and in the project folder run `mvn clean install -Dmaven.test.skip=true`. The archetype will be installed locally.

## Install with Eclipse
Load the project into Eclipse, right-click and choose `Run as` then `Maven Build...` (note the 3 dots).  Into `Goals` enter `clean install` and ensure `Skip Tests` is selected, then click `Run`.

## Create new project in Eclipse
To create a new project using this archetype:
1. Choose `File -> New` and select `Maven Project` (or `Other` then expand `Maven` and select `Maven Project`)
1. Select `Use default Workspace location`, click `Next`
2. In `Filter` enter `processing_java` and then click on the item that appears below.  Its `Group Id` will be `uk.ac.aston`, its `Artifact Id` will be `processing_java` and the `Version` is currently `1.0`.  Click `Next`
1. Add a `Group Id` for the new project (eg `uk.ac.aston`) and add and `Artifact Id` (eg `example`), and give a value to `app-name` (this will be the name of the class with `settings`, `draw` and `main` methods). 
1. Click `Finish`.
