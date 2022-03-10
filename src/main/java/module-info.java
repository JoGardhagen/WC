module com.gardhagen.joakim.wc.wc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gardhagen.joakim.wc.wc to javafx.fxml;
    exports com.gardhagen.joakim.wc.wc;
}