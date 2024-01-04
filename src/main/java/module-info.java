module com.example.rosterapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.rosterapp to javafx.fxml;
    exports com.example.rosterapp;
}