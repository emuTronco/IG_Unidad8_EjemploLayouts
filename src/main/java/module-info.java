module com.example.unidad8_ejemplolayouts {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.unidad8_ejemplolayouts to javafx.fxml;
    exports com.example.unidad8_ejemplolayouts;
}