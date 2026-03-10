module com.cmc.bai4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cmc.bai4 to javafx.fxml;
    exports com.cmc.bai4;
}
