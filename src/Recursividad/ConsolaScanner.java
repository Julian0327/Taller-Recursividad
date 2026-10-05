package Recursividad;

import java.util.Scanner;

public class ConsolaScanner implements Consola {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                mostrar("Valor inválido, intenta de nuevo.");
            }
        }
    }

    @Override
    public double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                mostrar("Valor inválido, intenta de nuevo.");
            }
        }
    }

    @Override
    public String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    @Override
    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}