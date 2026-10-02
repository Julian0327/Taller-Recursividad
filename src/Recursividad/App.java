package Recursividad;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Consola consola = new ConsolaScanner();

        List<Ejercicio> ejercicios = Arrays.asList(
                new Ejercicio1(consola),
                new Ejercicio2(consola),
                new Ejercicio3(consola),
                new Ejercicio4(consola));

        new Menu(ejercicios, consola).iniciar();
    }

}