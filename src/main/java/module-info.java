module com.ejemplo.ed_41_miniinventario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ejemplo.ed_41_miniinventario to javafx.fxml;
    exports com.ejemplo.ed_41_miniinventario;
}