package res;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
        @FXML
        private Button Button1;

        @FXML
        private Button Button2;

        @FXML
        private Button Button3;

        @FXML
        private Label Label;

        @FXML
        private Label addLabel;

        @FXML
        private Button calculate;

        @FXML
        private Button clear;

        @FXML
        private Button buttonPlus;

        @FXML
        private Button buttonMinus;

        @FXML
        private TextField textA;

        @FXML
        private TextField textB;

        @FXML
        private TextField textSum;



        @FXML
        private void clickbutton1(ActionEvent event1) {
            Label.setText("Clicked Button 1");
        }

        @FXML
        private void clickbutton2(ActionEvent event2) {
            Label.setText("Clicked Button 2");
        }

        @FXML
        private void clickbutton3(ActionEvent event3) {
            Label.setText("Clicked Button 3");
        }

        int sum=0;

        @FXML
        private void ClickCalculate(ActionEvent event4){
                Double a = Double.parseDouble(textA.getText().replaceAll(",","."));
                Double b = Double.parseDouble(textB.getText().replaceAll(",","."));
                textSum.setText(String.valueOf(a+b));
        }

        @FXML
        private void ClickClear(ActionEvent event5){
                textSum.setText("");
                textA.setText("");
                textB.setText("");
        }

        @FXML
        private void ClickPlus(ActionEvent event6){
                if(sum<3){
                        sum++;
                        addLabel.setText(String.valueOf(sum));
                }
        }

        @FXML
        private void ClickMinus(ActionEvent event7){
                if(sum>-5){
                        sum--;
                        addLabel.setText(String.valueOf(sum));
                }
        }
}