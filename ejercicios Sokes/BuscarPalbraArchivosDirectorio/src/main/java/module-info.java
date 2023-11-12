module com.example.buscarpalbraarchivosdirectorio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens buscarpalabra to javafx.fxml;
    exports buscarpalabra;
}