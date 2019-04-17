package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable
{
    @FXML
    Label text;
    ArrayList<String> line = new ArrayList<String>();

    int i = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        text.setText("");
        File file = new File("/home/ahmedulkavi/Desktop/Projects/FXTest/src/sample/text.txt");
        try {
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine())
            {
                line.add(sc.nextLine());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void setText(KeyEvent event)
    {
        if(event.getCode() == KeyCode.ENTER) {
            if (i == line.size())
                text.setText("Nai r");
            else {
                text.setText(line.get(i));
                i++;
            }
        }

    }
}
