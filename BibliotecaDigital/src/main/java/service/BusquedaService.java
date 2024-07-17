package service;

import model.Libro;

public class BusquedaService {
    private Nodo raiz;

    // Clase Nodo para representar los nodos del árbol
    private static class Nodo {
        Libro libro;
        Nodo izquierdo, derecho;

        public Nodo(Libro libro) {
            this.libro = libro;
            izquierdo = derecho = null;
        }
    }

    // Método para insertar un libro en el ABB
    public void insertar(Libro libro) {
        raiz = insertarRec(raiz, libro);
    }

    // Método auxiliar recursivo para insertar un libro
    private Nodo insertarRec(Nodo raiz, Libro libro) {
        if (raiz == null) {
            raiz = new Nodo(libro);
            return raiz;
        }

        // Insertar en el subárbol izquierdo si el título es menor
        if (libro.getTitulo().compareTo(raiz.libro.getTitulo()) < 0) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, libro);
        }
        // Insertar en el subárbol derecho si el título es mayor
        else if (libro.getTitulo().compareTo(raiz.libro.getTitulo()) > 0) {
            raiz.derecho = insertarRec(raiz.derecho, libro);
        }

        return raiz;
    }

    // Método para buscar un libro por título en el ABB
    public Libro buscar(String titulo) {
        return buscarRec(raiz, titulo);
    }

    // Método auxiliar recursivo para buscar un libro por título
    private Libro buscarRec(Nodo raiz, String titulo) {
        // Caso base: el árbol está vacío o el título coincide con el nodo actual
        if (raiz == null || raiz.libro.getTitulo().equals(titulo)) {
            return raiz != null ? raiz.libro : null;
        }

        // Buscar en el subárbol izquierdo si el título es menor
        if (titulo.compareTo(raiz.libro.getTitulo()) < 0) {
            return buscarRec(raiz.izquierdo, titulo);
        }
        // Buscar en el subárbol derecho si el título es mayor
        else {
            return buscarRec(raiz.derecho, titulo);
        }
    }
}
