package Recursividad;

public class Ejercicio2 extends EjercicioBase {

    public Ejercicio2(Consola consola) {
        super(2, "Sumatoria hasta n", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un numero: ");
    }

    private void mostrarResultado(int n, long resultado) {
        consola.mostrar("La sumatoria hasta " + n + " es " + resultado);
    }

    @Override
    public void resolver() {
        int n = pedirNumero();
        long resultado = sumatoria(n);
        mostrarResultado(n, resultado);
    }

    public static long sumatoria(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumatoria(n - 1);
        }
    }

}
