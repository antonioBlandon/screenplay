package co.com.bancolombia.certificacion.screenplay.models;

public class DatosPuntoDeVenta {
	
	private String direccionPuntoDeVenta;
	private String tipoDeVenta;
	private String tipoAbonoVentas;
	private String redDeseada;
	
	public String getRedDeseada() {
		return redDeseada;
	}
	public void setRedDeseada(String redDeseada) {
		this.redDeseada = redDeseada;
	}
	public String getDireccionPuntoDeVenta() {
		return direccionPuntoDeVenta;
	}
	public void setDireccionPuntoDeVenta(String direccionPuntoDeVenta) {
		this.direccionPuntoDeVenta = direccionPuntoDeVenta;
	}
	public String getTipoDeVenta() {
		return tipoDeVenta;
	}
	public void setTipoDeVenta(String tipoDeVenta) {
		this.tipoDeVenta = tipoDeVenta;
	}
	public String getTipoAbonoVentas() {
		return tipoAbonoVentas;
	}
	public void setTipoAbonoVentas(String tipoAbonoVentas) {
		this.tipoAbonoVentas = tipoAbonoVentas;
	}
	


}
