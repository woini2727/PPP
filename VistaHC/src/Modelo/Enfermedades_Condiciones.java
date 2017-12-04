package Modelo ;


import java.util.ArrayList;

public class  Enfermedades_Condiciones {
	ArrayList<String> enfermedades=new ArrayList<String>();
	
	
	public Enfermedades_Condiciones() {
		this.enfermedades.add("C�ncer");
		this.enfermedades.add("Trastornos psiquiatricos");
		this.enfermedades.add("Jaquecas");
		this.enfermedades.add("Retraso Mental");
		this.enfermedades.add("Malformaciones cong�nitas");
		this.enfermedades.add("Endocrinopat�as");
		this.enfermedades.add("Neumopat�as");
		this.enfermedades.add("Neuritis �ptica");
		this.enfermedades.add("Procesos �ticos");
		this.enfermedades.add("Cardiopat�as cong�nitas");
		this.enfermedades.add("Ulcera gastroduodenal");
		this.enfermedades.add("Cirrosis hep�tica");
		this.enfermedades.add("Apendicitis aguda");
		this.enfermedades.add("Nefropat�as");
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
