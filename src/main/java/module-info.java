module com.inventorymanagementsystem{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.media;
    requires java.base;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires jasperreports;
    requires org.burningwave.core;

    opens com.inventorymanagementsystem to javafx.fxml;
    exports com.inventorymanagementsystem;
    exports com.inventorymanagementsystem.entity;
    opens com.inventorymanagementsystem.entity to javafx.fxml;
    exports com.inventorymanagementsystem.config;
    opens com.inventorymanagementsystem.config to javafx.fxml;
    exports com.inventorymanagementsystem.app;
    opens com.inventorymanagementsystem.app to javafx.fxml;
}