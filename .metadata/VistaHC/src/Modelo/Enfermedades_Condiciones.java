package Modelo ;


import java.util.ArrayList;

public class  Enfermedades_Condiciones {
	ArrayList<String> enfermedades=new ArrayList<String>();
	
	
	public Enfermedades_Condiciones() {
		this.enfermedades.add("Cáncer");
		this.enfermedades.add("Trastornos psiquiatricos");
		this.enfermedades.add("Jaquecas");
		this.enfermedades.add("Retraso Mental");
		this.enfermedades.add("Malformaciones congénitas");
		this.enfermedades.add("Endocrinopatías");
		this.enfermedades.add("Neumopatías");
		this.enfermedades.add("Neuritis óptica");
		this.enfermedades.add("Procesos óticos");
		this.enfermedades.add("Cardiopatías congénitas");
		this.enfermedades.add("Ulcera gastroduodenal");
		this.enfermedades.add("Cirrosis hepática");
		this.enfermedades.add("Apendicitis aguda");
		this.enfermedades.add("Nefropatías");
		this.enfermedades.add("Enfermedades reumaticas");
		this.enfermedades.add("Alergias");
	}
	
	public String getEnfermedades() {
		String cadena = "";
		for(String e: enfermedades) {
			cadena=cadena+" "+ e;
			
		}
		
		return cadena;
		
	}
	
}
