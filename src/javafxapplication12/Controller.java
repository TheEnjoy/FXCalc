package javafxapplication12;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Text output;
    private long number1 = 0;
    private long number2 = 0;

    private boolean start = true;
    private String reset="";
    private String operator = "";
    private Model model = new Model();


    @FXML
    private void actionNumber(ActionEvent event){
        if (start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);

    }

    @FXML
    private void actionOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        
        if (!"=".equals(value)){
            if("C".equals(value)){
             output.setText("");
             return;
            }
            if (!operator.isEmpty()) return;
            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
        } else{
            if (operator.isEmpty()) return;
            output.setText(String.valueOf(model.calculation(number1, Double.parseDouble(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
    
 
}