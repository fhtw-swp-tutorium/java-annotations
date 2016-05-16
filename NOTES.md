# Release process

To release a new version to maven central, first either use the maven release plugin to prepare a new release or set the necessary information manually in the pom.xml.
Once you have set up everything correctly, invoke the following command to create all necessary artifacts, sign them and deploy them to sonatype.

`.\mvnw.cmd clean install gpg:sign nexus-staging:deploy`