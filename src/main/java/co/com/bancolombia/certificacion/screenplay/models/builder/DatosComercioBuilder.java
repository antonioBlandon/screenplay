package co.com.bancolombia.certificacion.screenplay.models.builder;

import co.com.bancolombia.certificacion.screenplay.Builder;
import co.com.bancolombia.certificacion.screenplay.models.DatosComercio;

import java.util.List;

public class DatosComercioBuilder implements Builder<DatosComercio> {

    private static final int TIPO_DE_IDENTIFICACION = 33;
    private static final int NUMERO_DE_IDENTIFICACION = 34;
    private static final int TIPO_DE_COMERCIO = 35;

    private String tipoDeIdentificacion;
    private String numeroDeIdentificacion;
    private String tipoDeComercio;

    public static DatosComercio datosComercio(List<String> informacion) {
        DatosComercioBuilder builder = new DatosComercioBuilder();
        builder.conTipoDeIdentificacion(informacion.get(TIPO_DE_IDENTIFICACION));
        builder.conNumeroDeIdentificacion(informacion.get(NUMERO_DE_IDENTIFICACION));
        builder.conTipoDeComercio(informacion.get(TIPO_DE_COMERCIO));
        return builder.build();
    }

    public DatosComercioBuilder conTipoDeIdentificacion(String tipoDeIdentificacion) {
        this.tipoDeIdentificacion = tipoDeIdentificacion;
        return this;
    }

    public DatosComercioBuilder conNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        return this;
    }

    public DatosComercioBuilder conTipoDeComercio(String tipoDeComercio) {
        this.tipoDeComercio = tipoDeComercio;
        return this;
    }

    @Override
    public DatosComercio build() {
        return new DatosComercio(tipoDeIdentificacion, numeroDeIdentificacion, tipoDeComercio);
    }

}
