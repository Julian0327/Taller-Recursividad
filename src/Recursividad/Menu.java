package Recursividad;

import java.util.List;

public class Menu {

    private static final int SALIR = 0;

    private final List<Ejercicio> ejercicios;
    private final Consola consola;

    public Menu(List<Ejercicio> ejercicios, Consola consola) {
        this.ejercicios = ejercicios;
        this.consola = consola;
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = consola.leerEntero("Elige un ejercicio: ");
            procesar(opcion);
        } while (opcion != SALIR);
    }

    private void mostrarOpciones() {
        consola.mostrar("\n--- Taller Recursividad ---");
        for (int i = 0; i < ejercicios.size(); i++) {
            consola.mostrar((i + 1) + ". " + ejercicios.get(i).getNombre());
        }
        consola.mostrar(SALIR + ". Salir");
    }

    private void procesar(int opcion) {
        if (opcion == SALIR) {
            consola.mostrar("Saliendo...");
        } else if (opcion < 1 || opcion > ejercicios.size()) {
            consola.mostrar("Opción no válida.");
        } else {
            ejecutarSeguro(ejercicios.get(opcion - 1));
        }
    }

    private void ejecutarSeguro(Ejercicio ejercicio) {
        try {
            ejercicio.ejecutar();
        } catch (IllegalArgumentException e) {
            consola.mostrar("Error: " + e.getMessage());
        } catch (StackOverflowError e) {
            consola.mostrar("Error: los valores son demasiado grandes para la recursión.");
        }
    }
}