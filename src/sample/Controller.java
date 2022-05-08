package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    private Button _boton;

    @FXML
    private TextField _numero;

    @FXML
    public void portkilling()
    {//"netstat -ano|findstr \"PID : "+_portn
        Runtime rt = Runtime.getRuntime();
        String numero = String.valueOf(_numero.getText());
        try {
            Process pr = rt.exec("netstat -ano|findstr \"PID : "+numero);
            _numero.setText("");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}

