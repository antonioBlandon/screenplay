package co.com.bancolombia.certificacion.screenplay.models;

public class DatosTributarios {
	
	private String casilla1;
	private String casilla2;
	private String casilla3;
	private String casilla4;
	private String fechaInicioActividad;
	private String fechaNacimiento;
	private String tipoSociedad;
	
	public String getTipoSociedad() {
		return tipoSociedad;
	}
	public void setTipoSociedad(String tipoSociedad) {
		this.tipoSociedad = tipoSociedad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCasilla1() { 
		return casilla1;
	}
	public void setCasilla1(String casilla1) {
		this.casilla1 = casilla1;
	}
	
	public String getCasilla2() {
		return casilla2;
	}
	public void setCasilla2(String casilla2) {
		this.casilla2 = casilla2;
	}
	public String getCasilla3() {
		return casilla3;
	}
	public void setCasilla3(String casilla3) {
		this.casilla3 = casilla3;
	}
	public String getCasilla4() {
		return casilla4;
	}
	public void setCasilla4(String casilla4) {
		this.casilla4 = casilla4;
	}
	public String getFechaInicioActividad() {
		return fechaInicioActividad;
	}
	public void setFechaInicioActividad(String fechaInicioActividad) {
		this.fechaInicioActividad = fechaInicioActividad;
	}

}
 