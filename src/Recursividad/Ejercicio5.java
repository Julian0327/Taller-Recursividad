package Recursividad;

public class Ejercicio5 extends EjercicioBase {

    public Ejercicio5(Consola consola) {
        super(5, "suma de los dijitos de un numero", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un numero: ");
    }

    private void mostrarResultado(int n, int resultado) {
        consola.mostrar("La suma de los digitos de " + n + " es " + resultado);
    }

    @Override
    public void resolver() {
        int n = pedirNumero();
        int resultado = sumaDeDigitos(n);
        mostrarResultado(n, resultado);
    }

    private int sumaDeDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDeDigitos(n / 10);
        }
    }

}
