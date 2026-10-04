package Recursividad;

public class Ejercicio9 extends EjercicioBase {

    public Ejercicio9(Consola consola) {
        super(9, "Multiplicacion por sumas sucesivas", consola);
    }

    private int pedirNumeroA() {
        return consola.leerEntero("Ingrese el primer numero: ");
    }

    private int pedirNumeroB() {
        return consola.leerEntero("Ingrese el segundo numero: ");
    }

    private void mostrarResultado(int a, int b, int resultado) {
        consola.mostrar("El resultado de multiplicar " + a + " por " + b + " es " + resultado);
    }

    @Override
    public void resolver() {
        int a = pedirNumeroA();
        int b = pedirNumeroB();
        int resultado = multiplicar(a, b);
        mostrarResultado(a, b, resultado);
    }

    private int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }
}
