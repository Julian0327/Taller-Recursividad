package Recursividad;

public class LectorDatos {

    private final Consola consola;

    public LectorDatos(Consola consola) {
        this.consola = consola;
    }

    public int[] leerArreglo() {
        int cantidad = consola.leerEntero("Cantidad de elementos: ");
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = consola.leerEntero("v[" + i + "]: ");
        }
        return arreglo;
    }

    public int[][] leerMatriz() {
        int filas = consola.leerEntero("Filas (m): ");
        int columnas = consola.leerEntero("Columnas (n): ");
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = consola.leerEntero("mat[" + i + "][" + j + "]: ");
            }
        }
        return matriz;
    }
}