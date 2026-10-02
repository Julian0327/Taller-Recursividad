package Recursividad;

public class Ejercicio1 extends EjercicioBase {

    public Ejercicio1(Consola consola) {
        super(1, " Factorial de un numero.", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un numero: ");
    }

    private void mostrarResultado(int n, long resultado) {
        consola.mostrar("El factorial de " + n + " es " + resultado);
    }

    @Override
    public void resolver() {
        int n = pedirNumero();
        long resultado = factorial(n);
        mostrarResultado(n, resultado);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
