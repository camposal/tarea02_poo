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

}
