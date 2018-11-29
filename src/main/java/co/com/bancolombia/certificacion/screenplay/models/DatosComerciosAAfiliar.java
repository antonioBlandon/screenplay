package co.com.bancolombia.certificacion.screenplay.models;

public class DatosComerciosAAfiliar {
	
	private String actividadComercial;
	private String ventaPromedio;
	private String ventasMensuales;
	private String puntosParaAfiliar;
	private String codigoMasterCard;
	private String rutaArchivoCedula;
	private String rutaArchivoNIT;
	
	public String getRutaArchivoNIT() {
		return rutaArchivoNIT;
	}
	public void setRutaArchivoNIT(String rutaArchivoNIT) {
		this.rutaArchivoNIT = rutaArchivoNIT;
	}
	public String getRutaArchivoCedula() {
		return rutaArchivoCedula;
	}
	public void setRutaArchivoCedula(String rutaArchivoCedula) {
		this.rutaArchivoCedula = rutaArchivoCedula;
	}
	public String getCodigoMasterCard() {
		return codigoMasterCard;
	}
	public void setCodigoMasterCard(String codigoMasterCard) {
		this.codigoMasterCard = codigoMasterCard;
	}
	public String getActividadComercial() {
		return actividadComercial;
	}
	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}
	public String getVentaPromedio() {
		return ventaPromedio;
	}
	public void setVentaPromedio(String ventaPromedio) {
		this.ventaPromedio = ventaPromedio;
	}
	public String getVentasMensuales() {
		return ventasMensuales;
	}
	public void setVentasMensuales(String ventasMensuales) {
		this.ventasMensuales = ventasMensuales;
	}
	public String getPuntosParaAfiliar() {
		return puntosParaAfiliar;
	}
	public void setPuntosParaAfiliar(String puntosParaAfiliar) {
		this.puntosParaAfiliar = puntosParaAfiliar;
	}

}


