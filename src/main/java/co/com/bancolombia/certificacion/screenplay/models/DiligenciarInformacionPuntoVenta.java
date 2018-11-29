package co.com.bancolombia.certificacion.screenplay.models;

public class DiligenciarInformacionPuntoVenta {
	
	private String ciiu;
	private String valorVentaPromedio;
	private String actividadComercial;
	private String cantidadPuntosDeVenta;
	private String valorActualDeVentas;
	private String rutaArchivoAdicional;
	
	public String getRutaArchivoAdicional() {
		return rutaArchivoAdicional;
	}
	public void setRutaArchivoAdicional(String rutaArchivoAdicional) {
		this.rutaArchivoAdicional = rutaArchivoAdicional;
	}
	public String getCiiu() {
		return ciiu;
	}
	public void setCiiu(String ciiu) {
		this.ciiu = ciiu;
	}
	public String getValorVentaPromedio() {
		return valorVentaPromedio;
	}
	public void setValorVentaPromedio(String valorVentaPromedio) {
		this.valorVentaPromedio = valorVentaPromedio;
	}
	public String getActividadComercial() {
		return actividadComercial;
	}
	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}
	public String getCantidadPuntosDeVenta() {
		return cantidadPuntosDeVenta;
	}
	public void setCantidadPuntosDeVenta(String cantidadPuntosDeVenta) {
		this.cantidadPuntosDeVenta = cantidadPuntosDeVenta;
	}
	public String getValorActualDeVentas() {
		return valorActualDeVentas;
	}
	public void setValorActualDeVentas(String valorActualDeVentas) {
		this.valorActualDeVentas = valorActualDeVentas;
	}

	

}
