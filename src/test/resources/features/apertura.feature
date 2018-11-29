@Apertura
Feature: Realizar Apertura de adquirencia
  AS a juan
  I want to realizar una apertura
  To crear una nueva adquirencia

 @AperturaCeduladeCiudadania
  Scenario: Realizar Apertura de adquirencia con Cedula de Ciudadania

    Given Juan este logueado en la aplicacion de Bizagi
    |         usuario           |
    |domain\ADQRadicadorApertura|

    When el este realizando una apertura
    | tipodeIdentificacion |numerodeIdentificacion|       tipodeComercio         |codigoCIIU|fechaMatriculaMercantil|codigoRadicadoMaster|actividadComercial|ventaPromedio|ventasMensuales|puntosParaAfiliar|                   rutaArchivoCedula                     |tipoDeCuenta|numeroDeCuenta|casilla1|casilla2|casilla3|casilla4|fechaInicioActividad|fechaNacimiento|  direccionPuntoDeVenta |           tipoDeVenta          |tipoAbonoVentas|redDeseada|relacionInmueble|antiguedadActividad|       areaLocal       |catidadPersonas|    tipoDocumento   |   nombre   |concepto |numeroDocumento|cargoEntrevistado|                   rutaArchivoCedula                     |
    | CEDULA DE CIUDADANIA |         333          | Sin Establecimiento Comercial|   8220   |      2018/09/01       |       12345        |      1520        |    12345    |    1234567    |        1        |C:\\Users\\1550772\\Desktop\\PITT\\Cedula_Comisiones.xlsx|   Ahorros  | 34567891011  |   11   |   12   |   13   |   14   |     2018/08/01     |  2000/09/04   |CR 38 75 B SUR 35 AP 610|Ventas con datafano (Presencial)|     Bruto     |CREDIBANCO|    Arriendo    |  De 13 a 24 meses |Mediana (21 a 100 mts2)|    11 a 15    |CEDULA DE CIUDADANIA|Pepito Perez|Favorable|    12345678   |   Propietario   |C:\\Users\\1550772\\Desktop\\PITT\\Cedula_Comisiones.xlsx|

    Then el pueda ver el mensaje SOLICITUD ENVIADA A LA RED
