module CowsAndBulls {
    requires javafx.controls;
    requires javafx.fxml;
    exports guessgame to javafx.graphics, javafx.fxml;
    opens guessgame to javafx.fxml, javafx.base;

}