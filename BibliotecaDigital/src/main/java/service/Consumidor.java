package service;

import model.Libro;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable {
    private BlockingQueue<Libro> cola;

    public Consumidor(BlockingQueue<Libro> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            Libro libro;
            while ((libro = cola.take()) != null) {
                // Procesa el libro recibido (por ejemplo, muestra en la interfaz gráfica)
                System.out.println("Libro recibido: " + libro.getTitulo());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
