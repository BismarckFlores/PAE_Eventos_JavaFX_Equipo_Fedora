module com.uam.paejavafxeventos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uam.paejavafxeventos to javafx.fxml;
    exports com.uam.paejavafxeventos;

    opens com.uam.paejavafxeventos.controller to javafx.fxml;
}