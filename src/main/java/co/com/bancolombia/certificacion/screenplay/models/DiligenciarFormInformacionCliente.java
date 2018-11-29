package co.com.bancolombia.certificacion.screenplay.models;

public class DiligenciarFormInformacionCliente {
	
	private String tipoIdentificacionComercio;
	private String numeroIdentificacionComercio;
	private String tipoIdentificacionCVB;
	private String numeroIdentificacionClienteVinculadoAlBanco;
	private String numeroCodigoUnicoComercio;
	private String nombreComercialPuntoVenta;
	private String tipoNovedad;
	private String rutaArchivoExcel;
	
	public String getRutaArchivoExcel() {
		return rutaArchivoExcel;
	}
	public void setRutaArchivoExcel(String rutaArchivoExcel) {
		this.rutaArchivoExcel = rutaArchivoExcel;
	}
	public String getTipoIdentificacionComercio() {
		return tipoIdentificacionComercio;
	}
	public void setTipoIdentificacionComercio(String tipoIdentificacionComercio) {
		this.tipoIdentificacionComercio = tipoIdentificacionComercio;
	}
	public String getNumeroIdentificacionComercio() {
		return numeroIdentificacionComercio;
	}
	public void setNumeroIdentificacionComercio(String numeroIdentificacionComercio) {
		this.numeroIdentificacionComercio = numeroIdentificacionComercio;
	}
	public String getTipoIdentificacionCVB() {
		return tipoIdentificacionCVB;
	}
	public void setTipoIdentificacionCVB(String tipoIdentificacionCVB) {
		this.tipoIdentificacionCVB = tipoIdentificacionCVB;
	}
	public String getNumeroIdentificacionClienteVinculadoAlBanco() {
		return numeroIdentificacionClienteVinculadoAlBanco;
	}
	public void setNumeroIdentificacionClienteVinculadoAlBanco(String numeroIdentificacionClienteVinculadoAlBanco) {
		this.numeroIdentificacionClienteVinculadoAlBanco = numeroIdentificacionClienteVinculadoAlBanco;
	}
	public String getNumeroCodigoUnicoComercio() {
		return numeroCodigoUnicoComercio;
	}
	public void setNumeroCodigoUnicoComercio(String numeroCodigoUnicoComercio) {
		this.numeroCodigoUnicoComercio = numeroCodigoUnicoComercio;
	}
	public String getNombreComercialPuntoVenta() {
		return nombreComercialPuntoVenta;
	}
	public void setNombreComercialPuntoVenta(String nombreComercialPuntoVenta) {
		this.nombreComercialPuntoVenta = nombreComercialPuntoVenta;
	}
	public String getTipoNovedad() {
		return tipoNovedad;
	}
	public void setTipoNovedad(String tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}
	
	
}
