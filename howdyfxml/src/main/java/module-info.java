module howdyfxml {
    requires javafx.controls;
    requires javafx.fxml;

    requires howdy;    
    
    opens edu.howdyfxml to javafx.fxml;
    exports edu.howdyfxml;
}
