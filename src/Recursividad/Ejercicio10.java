package Recursividad;

import java.util.Arrays;

public class Ejercicio10 extends EjercicioBase {

    private final LectorDatos lector;

    public Ejercicio10(Consola consola) {
        super(10, "Suma de los elementos de un arreglo", consola);
        this.lector = new LectorDatos(consola);
    }

    @Override
    public void resolver() {
        int[] arreglo = this.lector.leerArreglo();
        int suma = 0;
        suma = sumaVector(arreglo, 0);
        mostrarResultado(arreglo, suma);
    }

    private int sumaVector(int[] arreglo, int i) {
        if (i == arreglo.length) {
            return 0;
        }
        return arreglo[i] + sumaVector(arreglo, i + 1);
    }

    private void mostrarResultado(int[] arreglo, int suma) {
        consola.mostrar("El vector es: " + Arrays.toString(arreglo));
        consola.mostrar("La suma de los elementos del vector es: " + suma);
    }

}
