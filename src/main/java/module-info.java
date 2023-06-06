module com.example.space2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens Application to javafx.fxml;
    exports Application;
}