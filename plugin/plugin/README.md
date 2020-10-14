# plugin

This is the actual eclipse plugin. It contains the code / configuration to contribute functionality to eclipse and uses eclipse-specific classes to do so.

## Notes

- This plugin depends on a JAR library and an OSGI plugin. The jar library is referred to via `Bundle-Classpath` along with its dependencies, and the OSGI Library is referred to using `Import-Package`
- Note that the maven pom.xml does not use `<dependencies>` to refer to dependencies. This is because this is a Manifest first plugin built by Tycho, so it does not use that element for resolution but rather the Manifest file.
