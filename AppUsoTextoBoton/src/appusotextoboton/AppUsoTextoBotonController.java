/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import componentes_garciasergio.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author sergy
 */
public class AppUsoTextoBotonController implements Initializable {
    
    @FXML
    private Label result;
    @FXML
    private CampoTextoBoton component1;
    @FXML
    private CampoTextoBoton component2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       component1.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                result.setText("Se ha grabado: " + component1.getText());
            }
        });
       component2.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                result.setText("Se ha grabado: " + component2.getText());
            }
        });
    
    }
}
