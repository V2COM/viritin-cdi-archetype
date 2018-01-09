# Archetype for Vaadin + CDI projects

This is a WIP archetype for Vaadin + CDI projects. Currently uses alpha releases of Vaadin 8.3 and vaadin-cdi 3 series. Will change to stable releases soon when Vaadin 8.3 is out.

Note, the archetype is not regularly update to contain the latest Vaadin bugfix release, so check the latest version from vaadin.com/releases or use LATEST.

Until the final version is out, you can use the SNAPSHOT with following command:

    mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
        -DarchetypeGroupId=in.virit  \
        -DarchetypeArtifactId=cdi-app-archetype  \
        -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
        -DarchetypeVersion=1.0-SNAPSHOT

