package Recursividad;

public class Ejercicio7 extends EjercicioBase {

    public Ejercicio7(Consola consola) {
        super(7, "Máximo común divisor (Euclides)", consola);
    }

    private int pedirNumeroA() {
        return consola.leerEntero("Ingrese el primer numero: ");
    }

    private int pedirNumeroB() {
        return consola.leerEntero("Ingrese el segundo numero: ");
    }

    private void mostrarResultado(int a, int b, int resultado) {
        consola.mostrar("El máximo común divisor de " + a + " y " + b + " es " + resultado);
    }

    @Override
    public void resolver() {
        int a = pedirNumeroA();
        int b = pedirNumeroB();

        int resultado = maximoComunDivisor(Math.abs(a), Math.abs(b));

        mostrarResultado(a, b, resultado);
    }

    private int maximoComunDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return maximoComunDivisor(b, a % b);
        }
    }
}
