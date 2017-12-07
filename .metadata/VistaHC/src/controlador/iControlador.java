package controlador;

import java.io.IOException;

public interface iControlador {
	
	void llamarLogIn();

	boolean ComprobarClave(String clave) throws IOException;
}
