module com.gardhagen.joakim.wc.wc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens com.gardhagen.joakim.wc.app to javafx.fxml;
    exports com.gardhagen.joakim.wc.app;
}