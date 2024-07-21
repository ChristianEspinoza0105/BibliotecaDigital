package service;

import model.Libro;

import java.util.concurrent.BlockingQueue;

public class Productor implements Runnable {
    private BlockingQueue<Libro> cola;
    private Libro libro;

    public Productor(BlockingQueue<Libro> cola, Libro libro) {
        this.cola = cola;
        this.libro = libro;
    }

    @Override
    public void run() {
        try {
            cola.put(libro);
            System.out.println("Libro enviado a la cola: " + libro.getTitulo());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

