package excepciones;

public class ExcepcionCorreos extends RuntimeException {
// Excepción base no comprobada para errores propios de negocio
// Con la sobrecarga del constructor permite lanzar errores directos del dominio y/o envolver otras excepciones conservando su causa

    public ExcepcionCorreos(String mensaje) { // Excepción de negocio
        super(mensaje);
    }

    public ExcepcionCorreos(String mensaje, Throwable causa) { // Excepción con causa subyacente
        super(mensaje, causa);
    }
}
