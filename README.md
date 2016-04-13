# Java annotations

[![Travis](https://img.shields.io/travis/fhtw-swp-tutorium/java-annotations.svg)](https://travis-ci.org/fhtw-swp-tutorium/java-annotations)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.fhtw-swp-tutorium/annotations.svg)](http://mvnrepository.com/artifact/com.github.fhtw-swp-tutorium/annotations)

Dieses Repository enthält die Annotationen für die Übungen aus SWP. Sie können die aktuelle Version bequem über Maven einbinden. (Klick auf den Maven-Badge oben.)

Release Notes befinden sich in den Beschreibungen der Tags unter [Releases](https://github.com/fhtw-swp-tutorium/java-annotations/releases)

Um die letzte Entwicklungsversion (SNAPSHOT) zu erhalten, muss das folgende Repository zur Maven-Konfiguration (`pom.xml`) ihres Projektes hinzugefügt werden:

````xml
<repositories>
    <repository>
        <id>snapshots</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
        <releases>
            <enabled>false</enabled>
        </releases>
    </repository>
</repositories>
````