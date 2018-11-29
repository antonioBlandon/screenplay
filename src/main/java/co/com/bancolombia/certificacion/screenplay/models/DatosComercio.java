package co.com.bancolombia.certificacion.screenplay.models;

public class DatosComercio {

	private String tipodeIdentificacion;
	private String numerodeIdentificacion;
	private String tipodeComercio;

	public DatosComercio(String tipodeIdentificacion, String numerodeIdentificacion, String tipodeComercio) {
		this.tipodeIdentificacion = tipodeIdentificacion;
		this.numerodeIdentificacion = numerodeIdentificacion;
		this.tipodeComercio = tipodeComercio;
	}

	public String getTipodeIdentificacion() {
		return tipodeIdentificacion;
	}
	public void setTipodeIdentificacion(String tipodeIdentificacion) {
		this.tipodeIdentificacion = tipodeIdentificacion;
	}
	public String getNumerodeIdentificacion() {
		return numerodeIdentificacion;
	}
	public void setNumerodeIdentificacion(String numerodeIdentificacion) {
		this.numerodeIdentificacion = numerodeIdentificacion;
	}
	public String getTipodeComercio() {
		return tipodeComercio;
	}
	public void setTipodeComercio(String tipodeComercio) {
		this.tipodeComercio = tipodeComercio;
	}
	
	

	
}
