package Recursividad;

public class Ejercicio8 extends EjercicioBase {

    public Ejercicio8(Consola consola) {
        super(8, "Cociente por restas sucesivas", consola);
    }

    private int pedirNumeroA() {
        return consola.leerEntero("Ingrese el dividendo: ");
    }

    private int pedirNumeroB() {
        return consola.leerEntero("Ingrese el divisor: ");
    }

    private void mostrarResultado(int a, int b, int resultado) {
        consola.mostrar("El cociente de " + a + " dividido por " + b + " es " + resultado);
    }

    @Override
    public void resolver() {
        int a = pedirNumeroA();
        int b = pedirNumeroB();
        int resultado = dividir(a, b);
        mostrarResultado(a, b, resultado);
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        int cociente = cocientePorRestasSucesivas(Math.abs(a), Math.abs(b));
        boolean signosDistintos = (a < 0) != (b < 0);
        return signosDistintos ? -cociente : cociente;
    }

    private int cocientePorRestasSucesivas(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + cocientePorRestasSucesivas(a - b, b);
    }
}