package Recursividad;

public class Ejercicio6 extends EjercicioBase {

    public Ejercicio6(Consola consola) {
        super(6, "Potencia (base ^ exponente)", consola);
    }

    private int pedirBase() {
        return consola.leerEntero("Ingrese la base: ");
    }

    private int pedirExponente() {
        return consola.leerEntero("Ingrese el exponente: ");
    }

    private void mostrarResultado(int base, int exponente, int resultado) {
        consola.mostrar("La potencia de " + base + " elevado a " + exponente + " es " + resultado);
    }

    @Override
    public void resolver() {
        int base = pedirBase();
        int exponente = pedirExponente();
        if (exponente < 0) {
            consola.mostrar("El exponente debe ser no negativo.");
            return;
        }
        int resultado = potencia(base, exponente);
        mostrarResultado(base, exponente, resultado);
    }

    private int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

}
