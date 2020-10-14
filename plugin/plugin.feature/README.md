# feature

This is the eclipse feature that includes the plugin

## Notes

- The plugin is part of the feature XML, as well as its OSGi dependency. This allows the plugin to refer to classes from the OSGi dependency.
- The `dependencies` section of feature.xml can be computed from eclipse (open feature.xml, go to the Dependencies tab, click `Compute`)
