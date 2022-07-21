module com.example.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;

    opens com.example.helloworldfx to javafx.fxml;
    exports com.example.helloworldfx;
}