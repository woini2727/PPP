package Modelo;


import java.util.ArrayList;
import java.util.Date;

public class Ficha_identificacion {
	private String dni;
	private String apellido;
	private String nombre;
	private String sexo;
	private Date fechaNacimiento;
	private String grupo_sanguineo;
	private String estado_civil;
	private String origen_etnico;
	ArrayList <Contacto> contactos =new ArrayList<Contacto>();
	
	
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
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
	
}
