package Recursividad;

public class Ejercicio3 extends EjercicioBase {

    public Ejercicio3(Consola consola) {
        super(3, "Serie 1 + 1/2 + 1/3 + ... + 1/n", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un numero: ");
    }

    private void mostrarResultado(int n, double resultado) {
        consola.mostrar(String.format("El resultado de la serie hasta 1/%d es: %.4f", n, resultado));
    }

    @Override
    public void resolver() {
        int n = pedirNumero();
        double resultado = sumarSerie(n);
        mostrarResultado(n, resultado);
    }

    private double sumarSerie(int n) {
        if (n < 1)
            throw new IllegalArgumentException("n debe ser mayor o igual a 1.");
        if (n == 1)
            return 1.0;
        return 1.0 / n + sumarSerie(n - 1);
    }

}
