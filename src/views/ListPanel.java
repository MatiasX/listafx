package views;

import javafx.scene.control.ListView;

public class ListPanel extends ListView<String> {

    public ListPanel() {
        this.getItems().add("Alma");
        this.getItems().add("Szilva");
        this.getItems().add("Barack");
        this.getItems().add("Körte");
        this.getItems().add("Banán");
        this.getItems().add("Citrom");
    }
    
}
