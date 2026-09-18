module howdyfx {   
    requires javafx.controls;
    requires javafx.fxml;

    requires howdy;    
    
    opens edu.howdyfx to javafx.fxml;
    exports edu.howdyfx;
}
