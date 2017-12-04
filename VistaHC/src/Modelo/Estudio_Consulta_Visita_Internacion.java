package Modelo;

import java.util.Date;

public class Estudio_Consulta_Visita_Internacion {
	private Date Fecha_carga;
	private Date Fecha_consulta;
	private String Diagnostico;
	private String Tratamiento;
	private String pronostico;
	private String medicacion;
	
	public Estudio_Consulta_Visita_Internacion() {
		
	}
	
	
	public Date getFecha_carga() {
		return Fecha_carga;
	}
	public void setFecha_carga(Date fecha_carga) {
		Fecha_carga = fecha_carga;
	}
	public Date getFecha_consulta() {
		return Fecha_consulta;
	}
	public void setFecha_consulta(Date fecha_consulta) {
		Fecha_consulta = fecha_consulta;
	}
	public String getDiagnostico() {
		return Diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return Tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}
	public String getPronostico() {
		return pronostico;
	}
	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}
	public String getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
}
