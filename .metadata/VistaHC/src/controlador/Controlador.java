package controlador;

import java.io.IOException;

import Seguridad_Cifrado.ComprobarPass;
import application.VistaLog;
import javafx.stage.Stage;

public class Controlador implements iControlador {
	VistaLog vlog=new VistaLog();
	
	public Controlador() {
		
	}

	@Override
	public void llamarLogIn() {
		Stage primarystage=new Stage();
		vlog.start(primarystage);
	}

	@Override
	public boolean ComprobarClave(String clave) throws IOException {
		ComprobarPass cp=new ComprobarPass();
		
		return cp.comprobar(clave);
	}
}
