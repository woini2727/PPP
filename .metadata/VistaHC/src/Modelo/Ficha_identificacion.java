package Modelo;


import java.util.ArrayList;
import java.util.Date;

public class Ficha_identificacion {
	private String campo;
	private String dato; 
	
	/*	
 	private String apellido;
	private String nombre;
	private String sexo;
	private String fechaNacimiento;
	private String grupo_sanguineo;
	private String estado_civil;
	private String origen_etnico;
	ArrayList <Contacto> contactos =new ArrayList<Contacto>();
	*/
	public Ficha_identificacion(String campo,String da) {
		this.campo=campo;
		this.dato=da;
		
	}
	
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}


	public String getDato() {
		return dato;
	}


	public void setDato(String dato) {
		this.dato = dato;
	}
	
	/*public Ficha_identificacion(String dni,String apellido,String nombre,String sexo,String fn,String grupos,String estcivil,String orget) {
		this.dni=dni;
		this.apellido=apellido;
		this.nombre=nombre;
		this.sexo=sexo;
		this.fechaNacimiento=fn;
		this.grupo_sanguineo=grupos;
		this.estado_civil=estcivil;
		this.origen_etnico=orget;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGrupo_sanguineo() {
		return grupo_sanguineo;
	}
	public void setGrupo_sanguineo(String grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getOrigen_etnico() {
		return origen_etnico;
	}
	public void setOrigen_etnico(String origen_etnico) {
		this.origen_etnico = origen_etnico;
	}
	*/
}
