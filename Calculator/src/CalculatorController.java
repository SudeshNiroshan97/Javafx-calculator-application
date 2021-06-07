import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CalculatorController {

    public TextField txtInput;

    public void btnZero_OnAction(ActionEvent actionEvent) {
        txtInput.setText("0");
    }

    public void btnOne_OnAction(ActionEvent actionEvent) {
        txtInput.setText("1");
    }

    public void btnTwo_OnAction(ActionEvent actionEvent) {
        txtInput.setText("2");
    }

    public void btnThree_OnAction(ActionEvent actionEvent) {
        txtInput.setText("3");
    }

    public void btnFour_OnAction(ActionEvent actionEvent) {
        txtInput.setText("4");
    }

    public void btnFive_OnAction(ActionEvent actionEvent) {
        txtInput.setText("5");
    }

    public void btnSix_OnAction(ActionEvent actionEvent) {
        txtInput.setText("6");
    }

    public void btnSeven_OnAction(ActionEvent actionEvent) {
        txtInput.setText("7");
    }

    public void btnEight_OnAction(ActionEvent actionEvent) {
        txtInput.setText("8");
    }

    public void btnNine_OnAction(ActionEvent actionEvent) {
        txtInput.setText("9");
    }

    public void btnDecimal_OnAction(ActionEvent actionEvent) {
        txtInput.setText(".");
    }

    public void btnClear_OnAction(ActionEvent actionEvent) {
        txtInput.clear();
    }

    public void btnEqual_OnAction(ActionEvent actionEvent) {

    }
    public void btnAdd_OnAction(ActionEvent actionEvent) {

    }

    public void btnSub_OnAction(ActionEvent actionEvent) {

    }


    public void btnMul_OnAction(ActionEvent actionEvent) {

    }
}
