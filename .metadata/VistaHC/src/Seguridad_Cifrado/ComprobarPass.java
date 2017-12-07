package Seguridad_Cifrado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComprobarPass {
	private static final String FILENAME = "BDpass.txt";
	
	public ComprobarPass() throws IOException {
		
		}
	
	public boolean comprobar(String pass) throws IOException {
		boolean b=false;
		for (String line : Files.readAllLines(Paths.get("C:\\Users\\Salvador\\eclipse-workspace\\VistaHC\\src\\BDpass"))) {
			if (line.equals(pass)) {
				b=true;
			}
		}
		return b;
	}

	
}
