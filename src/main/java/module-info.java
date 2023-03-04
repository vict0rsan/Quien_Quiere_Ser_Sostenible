module com.odsgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.odsgame to javafx.fxml;
    exports com.odsgame;
    exports com.odsgame.controllers;
    opens com.odsgame.controllers to javafx.fxml;
}