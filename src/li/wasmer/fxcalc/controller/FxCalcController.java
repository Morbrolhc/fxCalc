package li.wasmer.fxcalc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FxCalcController {

	private final static int DISPLAY_SIZE = 12;

	@FXML
	private Label mainLabel;

	@FXML
	private Button button0;

	@FXML
	private Button button1;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Button button4;

	@FXML
	private Button button5;

	@FXML
	private Button button6;

	@FXML
	private Button button7;

	@FXML
	private Button button8;

	@FXML
	private Button button9;

	@FXML
	private Button buttonC;

	@FXML
	private Button buttonDecimal;

	@FXML
	protected void inputNum(ActionEvent event) {
		if (mainLabel.getText().length() == DISPLAY_SIZE) {
			return;
		}
		String value = ((Button) event.getSource()).getText();
		if ("0".equals(mainLabel.getText())) {
			mainLabel.setText(value);
		} else {
			mainLabel.setText(mainLabel.getText() + value);
		}
	}

	@FXML
	protected void inputReset(ActionEvent event) {
		mainLabel.setText("0");
	}

}
