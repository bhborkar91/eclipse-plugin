# library

This is a simple java library project. It has a dependency on commons collections and returns a string.

It's a normal maven java project with nothing special.

## Notes

- This library is included directly on the plugin project classpath.
- As it's a JAR library with another JAR as dependency, the dependency itself needs to be present on the plugin projects classpath as well (since a jar file cannot load a jar dependency from inside itself)
