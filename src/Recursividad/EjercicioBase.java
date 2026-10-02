package Recursividad;

public abstract class EjercicioBase implements Ejercicio {

    protected final Consola consola;
    private final int numero;
    private final String titulo;

    protected EjercicioBase(int numero, String titulo, Consola consola) {
        this.numero = numero;
        this.titulo = titulo;
        this.consola = consola;
    }

    @Override
    public String getNombre() {
        return titulo;
    }

    @Override
    public final void ejecutar() {
        consola.mostrar("--- Ejercicio " + numero + ": " + titulo + " ---");
        resolver();
    }

    protected abstract void resolver();
}