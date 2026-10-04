package Recursividad;

public class Ejercicio11 extends EjercicioBase {

    private final LectorDatos lector;

    public Ejercicio11(Consola consola) {
        super(11, "Suma los elemnetos de una matriz", consola);
        this.lector = new LectorDatos(consola);
    }

    @Override
    public void resolver() {
        int[][] matriz = lector.leerMatriz();
        int resultado = sumarFilas(matriz, 0);
        mostrarResultado(matriz, resultado);
    }

    private int sumarFilas(int[][] matriz, int fila) {
        if (fila == matriz.length) {
            return 0;
        }
        int sumaFila = sumaElementosFila(matriz[fila], 0);
        return sumaFila + sumarFilas(matriz, fila + 1);
    }

    private int sumaElementosFila(int[] fila, int i) {
        if (i == fila.length) {
            return 0;
        }
        return fila[i] + sumaElementosFila(fila, i + 1);
    }

    private void mostrarResultado(int[][] matriz, int suma) {
        consola.mostrar("La suma de los elementos de la matriz es " + suma);
    }

}
