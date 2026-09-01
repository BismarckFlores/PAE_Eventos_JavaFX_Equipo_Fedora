module com.uam.paejavafxeventos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uam.paejavafxeventos to javafx.fxml;
    exports com.uam.paejavafxeventos;
}