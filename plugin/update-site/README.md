# update-site

This is the update site. The output from its build can be added to the software sources in eclipse to install the plugin.

## Notes

- If rebuilding the plugin, the version of the plugin and feature should be changed - eclipse seems to cache the jar file and use an older jar for installation if the version is not changed. Clearing the site cache does not seem to fix this