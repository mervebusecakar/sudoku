module com.example.sudokututorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sudokututorial to javafx.fxml;
    exports com.example.sudokututorial;
    exports application;
    opens application to javafx.fxml;
}