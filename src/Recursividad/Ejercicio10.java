package Recursividad;

public class Ejercicio10 extends EjercicioBase {

    public Ejercicio10(Consola consola) {
        super(10, "Suma de los elementos de un arreglo", consola);
    }

    private int[] pedirArreglo() {
        int[] arreglo = new int[consola.leerEntero("Ingrese la longitud del arreglo: ")];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = consola.leerEntero("Ingrese el elemento " + (i + 1) + ": ");
        }
        return arreglo;
    }

    private void mostrarResultado(int[] arreglo, int suma) {
        consola.mostrar("La suma de los elementos del arreglo es " + suma);
    }

    private int sumarArreglo(int[] arreglo, int indice) {
        if (indice == arreglo.length) {
            return 0;
        }
        return arreglo[indice] + sumarArreglo(arreglo, indice + 1);
    }

    @Override
    public void resolver() {
        int[] arreglo = pedirArreglo();
        int suma = sumarArreglo(arreglo, 0);
        mostrarResultado(arreglo, suma);
    }

}
