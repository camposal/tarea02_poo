package utilidades;

public final class Validador {
// Esta clase final no permite herencia 'extends'
// El constructor privado no permite instanciar desde fuera y la excepción desde adentro
// Los métodos estáticos permiten ser llamados sin objeto

    private Validador() {
        throw new UnsupportedOperationException("Clase no destinada a instanciarse.");
    }

    public static double validarDouble(String cifra, String variableError) {
        // Acepta +enteros y +decimales .2f 
        String mensajeError = "La cifra de " + variableError + " debe ser numerica y mayor que cero.";

        if (cifra == null) {
            throw new IllegalArgumentException(mensajeError);
        }

        cifra = cifra.strip().replace(",", ".");
        if (!cifra.matches("\\d+(\\.\\d{1,2})?")) {
            throw new IllegalArgumentException(mensajeError);
        }

        double cifraValidada = Double.parseDouble(cifra);
        if (cifraValidada <= 0) {
            throw new IllegalArgumentException(mensajeError);
        }
        return cifraValidada;
    }

    public static String validarString(String texto, boolean esEstricto) {
        if (texto == null || texto.strip().isEmpty()) {
            throw new IllegalArgumentException("El campo no puede estar vacio.");
        }

        texto = texto.strip();
        String regex = esEstricto ? "^[\\p{L}]+(\\s+[\\p{L}]+)*$" : "^[\\p{L}\\d]+(\\s+[\\p{L}\\d]+)*$";

        if (!texto.matches(regex)) {
            String detalle = esEstricto ? "letras y espacios." : "letras, numeros y espacios.";
            throw new IllegalArgumentException("El campo solo puede contener " + detalle);
        }

        return texto.toUpperCase();
    }

    public static String validarCorreo(String correo) {
        // Formato aceptado: abc@dominio.ext sin espacios
        if (correo == null || correo.strip().isEmpty()) {
            throw new IllegalArgumentException("El correo no puede estar vacio.");
        }

        correo = correo.strip();
        if (!correo.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$")) {
            throw new IllegalArgumentException("El correo no tiene un formato valido.");
        }

        return correo.toLowerCase();
    }

}
