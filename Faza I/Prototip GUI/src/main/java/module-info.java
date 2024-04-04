module org.example.urmarirebuguri {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.urmarirebuguri to javafx.fxml;
    exports org.example.urmarirebuguri;
}