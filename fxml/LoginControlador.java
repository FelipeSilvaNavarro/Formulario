package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	@FXML
	private Button botaoEntrar;

	public void entrar() {
		boolean emailValido = campoEmail.getText().contains("@");
		boolean emailValido2 = campoEmail.getText().contains(".com");
		boolean senhaValida = campoSenha.getText().matches("[0-9]+");

		if (emailValido && senhaValida && emailValido2) {
			Notifications.create().title("Login FXML").text("Login efetuado com Sucesso!").showInformation();
		} else {
			Notifications.create().title("Login FXML").text("Ocorreu um erro").showError();
		}
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());

	}

}
