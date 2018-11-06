package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {

    ArrayList<String> numbersArray = new ArrayList<String>();
    int resultat = 0;

    @FXML
    public TextField talDisplay;

    public void plusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbersArray.add(s);
        System.out.println(s + "er nu tilføjet. ");
    }

    public void minusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbersArray.add(s);
        System.out.println(s + "er nu tilføjet. ");
    }

    public void equalsMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbersArray.add(s);
        talDisplay.clear();
        System.out.println(s + "er nu tilføjet. ");

        for (String number: numbersArray) {
            resultat += Integer.parseInt(number);
        }

        talDisplay.setText(Integer.toString(resultat));
    }
}
