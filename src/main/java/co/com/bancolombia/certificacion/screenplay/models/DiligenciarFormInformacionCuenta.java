package co.com.bancolombia.certificacion.screenplay.models;

public class DiligenciarFormInformacionCuenta {
	
	private String tipoCuenta;
	private String numeroCuenta;
	private String numeroCodigoUnicoComercioParaCC;
	private String rutaArchivoAdicionalCCoNIT;
	
	public String getRutaArchivoAdicionalCCoNIT() {
		return rutaArchivoAdicionalCCoNIT;
	}
	public void setRutaArchivoAdicionalCCoNIT(String rutaArchivoAdicionalCCoNIT) {
		this.rutaArchivoAdicionalCCoNIT = rutaArchivoAdicionalCCoNIT;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNumeroCodigoUnicoComercioParaCC() {
		return numeroCodigoUnicoComercioParaCC;
	}
	public void setNumeroCodigoUnicoComercioParaCC(String numeroCodigoUnicoComercioParaCC) {
		this.numeroCodigoUnicoComercioParaCC = numeroCodigoUnicoComercioParaCC;
	}

	
}
