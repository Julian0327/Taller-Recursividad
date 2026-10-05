package Recursividad;

public class Ejercicio13 extends EjercicioBase {
    public Ejercicio13(Consola consola) {
        super(13, "Función de Ackermann", consola);
    }

    @Override
    public void resolver() {
        int m = pedirNumero("Ingrese el valor de m: ");
        int n = pedirNumero("Ingrese el valor de n: ");
        int resultado = ackermann(m, n);
        mostrarResultado(m, n, resultado);
    }

    private int pedirNumero(String mensaje) {
        return consola.leerEntero(mensaje);
    }

    private int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    private void mostrarResultado(int m, int n, int resultado) {
        consola.mostrar("El valor de la función de Ackermann para m=" + m + " y n=" + n + " es: " + resultado);
    }
}
