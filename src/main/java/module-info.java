module com.example.rso_java_az {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.rso_java_az to javafx.fxml;
    exports com.example.rso_java_az;
}