package Modelo;

public class Contacto {
	private String nombre_contacto;
	private String telefono_fijo;
	private String telefon_celular;
	private String e_mail;
	
	
	public String getNombre_contacto() {
		return nombre_contacto;
	}
	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}
	public String getTelefono_fijo() {
		return telefono_fijo;
	}
	public void setTelefono_fijo(String telefono_fijo) {
		this.telefono_fijo = telefono_fijo;
	}
	public String getTelefon_celular() {
		return telefon_celular;
	}
	public void setTelefon_celular(String telefon_celular) {
		this.telefon_celular = telefon_celular;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
}
