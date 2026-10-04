package Recursividad;

public class Ejercicio12 extends EjercicioBase {

    public Ejercicio12(Consola consola) {
        super(12, "Serie de Fibonacci hasta un límite", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese la cantidad de términos: ");
    }

    @Override
    public void resolver() {
        int limite = pedirNumero();
        String resultado = fibonacci(limite);
        mostrarResultado(limite, resultado);
    }

    private String fibonacci(int limite) {
        if (limite <= 0) {
            throw new IllegalArgumentException("La cantidad de términos debe ser mayor a cero.");
        }
        if (limite == 1) {
            return "0";
        }
        return fibonacci(limite - 1) + ", " + calcularFibonacci(limite - 1);
    }

    private int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    private void mostrarResultado(int limite, String resultado) {
        consola.mostrar("Los números de la sucesión de Fibonacci hasta " + limite + " términos son: " + resultado);
    }
}
