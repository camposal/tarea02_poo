package excepciones;

public class EstadoEnvioInvalidoException extends ExcepcionCorreos {
// Error de negocio al intentar manipular un envío cuyo estado no lo permite

    public EstadoEnvioInvalidoException(String mensaje) {
        super(mensaje);
    }

    public EstadoEnvioInvalidoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
