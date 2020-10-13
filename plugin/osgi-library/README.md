# osgi-library

This is an OSGI library. It also has a class that returns a string when its method is called. It has a dependency on commons-text.

Since osgi libraries can be fat jars (with jars inside themselves) the build for this will include its dependency in the final jar.

Tycho is used to build this project, so its dependencies are not declared as <dependencies> element. Instead, the maven build will copy the jars to the lib folder, and the eclipse project will refer the jars from there.

The dependencies are also declared in the MANIFEST.MF file for this plugin.