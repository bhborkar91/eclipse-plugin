# eclipse-plugin

This is a project created to understand how eclipse plugins are structured and built, and how dependency resolution with libraries can be handled in them.

## Pre-requisites

- Apache Maven 3.6.3
- Java 8
- [Eclipse 2020-06 for Eclipse Committers](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-eclipse-committers)

## Setup

- Clone the repo
- `cd plugin`
- Run `mvn clean install`
- Open eclipse and import the projects from repo

## Running from eclipse

- Right-click `com.bhborkar.ide.plugin` and go to `Run as -> Eclipse Application`
- A new instance of eclipse is opened, with the plugin installed

## Installing into standalone eclipse

- Build the repo using `mvn clean install` from the parent project
- Eclipse update site will be created in the project `com.bhborkar.ide.update-site` at `target/site`
- In your eclipse instance, go to `Help -> Install New Software`
- Add a new software site (give it the path of the local folder above)
- Select and install the feature, restart eclipse

## Plugin implmentation

This plugin adds the following to eclipse

- A menu with a Hello World menu option which shows a message dialog

## Individual project README's

These files explain the purpose and the configuration of each project

- [A JAR dependency for the plugin](library/)
- [An OSGi dependency for the plugin](osgi-library/)
- [The plugin project](plugin/)
- [The feature that includes the plugin](plugin.feature/)
- [The update site for the plugin](update-site/)

## References

- https://www.vogella.com/tutorials/EclipsePlugin/article.html - for creating the plugin projects
- https://www.jrebel.com/blog/how-to-build-eclipse-plugins - for setting up maven build of the plugin
- https://www.eclipse.org/articles/Article-Eclipse-and-Maven2/ - some notes for setting up of maven build, file layout
- https://wiki.eclipse.org/Tycho/Reference_Card#Examplary_parent_POM - pom reference
- https://git.eclipse.org/c/tycho/org.eclipse.tycho.git/tree/tycho-its/projects - some example projects
- https://eclipsesource.com/blogs/tutorials/eclipse-4-e4-tutorial-part-6-behavior-annotations/ - e4 syntax tutorial

