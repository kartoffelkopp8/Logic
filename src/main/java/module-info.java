module com.example.logic {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.logic to javafx.fxml;
    exports com.example.logic;
    exports Logic;
    opens Logic to javafx.fxml;
}