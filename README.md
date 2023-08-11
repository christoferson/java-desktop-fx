# java-desktop-fx
Java Desktop FX - Java 17


mvn archetype:generate ^
        -DarchetypeGroupId=org.openjfx ^
        -DarchetypeArtifactId=javafx-archetype-simple ^
        -DarchetypeVersion=0.0.3 ^
        -DgroupId=org.openjfx ^
        -DartifactId=sample ^
        -Dversion=1.0.0 ^
        -Djavafx-version=17

## Java FX Maven Dependency

javafx-fxml | (link)[https://mvnrepository.com/artifact/org.openjfx/javafx-fxml]
Java 17 17.0.8
Java 18 18.0.2


mvn clean javafx:run