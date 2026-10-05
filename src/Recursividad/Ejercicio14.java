package Recursividad;

public class Ejercicio14 extends EjercicioBase {
    public Ejercicio14(Consola consola) {
        super(14, "copiar una cadena en otra cadena", consola);
    }

    public void resolver() {
        String cadena = consola.leerCadena("Ingrese una cadena: ");
        String resultado = copiarCadena(cadena);
        mostrarResultado(resultado);
    }

    private void mostrarResultado(String resultado) {
        consola.mostrar("La cadena original es: " + resultado);
        consola.mostrar("La cadena copiada es: " + resultado);
    }

    private String copiarCadena(String cadena) {
        if (cadena.equals("")) {
            return "";
        }
        return cadena.charAt(0) + copiarCadena(cadena.substring(1));
    }

}