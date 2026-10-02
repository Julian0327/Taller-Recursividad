package Recursividad;

public class Ejercicio4 extends EjercicioBase {

    public Ejercicio4(Consola consola) {
        super(4, "Inverti Numero", consola);
    }

    private int pedirNumero() {
        return consola.leerEntero("Ingrese un numero: ");
    }

    private void mostrarResultado(int n, int resultado) {
        consola.mostrar("El numero invertido de " + n + " es " + resultado);
    }

    @Override
    public void resolver() {
        int n = pedirNumero();
        int resultado = invertirNumero(n);
        mostrarResultado(n, resultado);
    }

    private int invertirNumero(int n) {
        if (n < 10) {
            return n;
        }
        return invertirNumero(n / 10) + (n % 10) * (int) Math.pow(10, String.valueOf(n).length() - 1);
    }

}
