module example {

    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires java.desktop;

    exports com.example;
}