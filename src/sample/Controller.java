package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    private Label _etiqueta;
    @FXML
    private Button _boton;

    @FXML
    private TextField _numero;

    @FXML
    public void portkilling()
    {//"netstat -ano|findstr \"PID : "+_portn
        Runtime rt = Runtime.getRuntime();
        String numero = String.valueOf(_numero.getText());
        String cmd = "netstat -ano|findstr \"PID : "+numero+"\"";
        System.out.println(cmd);
        try {
            Process pr = rt.exec(cmd);
            _numero.setText("");
            _etiqueta.setText("You killed that port");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}

