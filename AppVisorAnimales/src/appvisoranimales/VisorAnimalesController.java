/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author sergy
 */
public class VisorAnimalesController implements Initializable {

    @FXML
    private ListView<Animal> listView;
    @FXML
    private ImageView imageView;
    private Label label;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<Animal> animales = FXCollections.observableArrayList();
        
        animales.add(new Animal("Burro","img/peq_burro.jpg","img/burro.jpg"));
        animales.add(new Animal("Koala","img/peq_koala.jpg","img/koala.jpg"));
        animales.add(new Animal("Cerdo","img/peq_cerdo.jpg","img/cerdo.jpg"));
        
        listView.setItems(animales);
        
        listView.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        listView.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
                imageView.setImage(new Image(new_val.getImagenGrande()));
        });
    }    
    
}
