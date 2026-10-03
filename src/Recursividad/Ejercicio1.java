package Recursividad;

import java.math.BigInteger;

public class Ejercicio1 extends EjercicioBase {

    public Ejercicio1(Consola consola) {
        super(1, "Factorial de un número", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un número: ");
    }

    @Override
    protected void resolver() {
        int n = pedirNumero();
        BigInteger resultado = factorial(n);
        mostrarResultado(n, resultado);
    }

    private BigInteger factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("El número no puede ser negativo.");
        if (n <= 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    private void mostrarResultado(int n, BigInteger resultado) {
        consola.mostrar("El factorial de " + n + " es: " + resultado);
    }
}