package service;

import java.util.List;

import model.Libro;

public class OrdenamientoService {
    
    // Método principal para invocar el algoritmo MergeSort
    public static void mergeSort(List<Libro> libros) {
        if (libros == null || libros.size() <= 1) {
            return;
        }
        sort(libros, 0, libros.size() - 1);
    }

    // Implementación del algoritmo MergeSort
    private static void sort(List<Libro> libros, int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Ordenar la mitad izquierda
            sort(libros, inicio, medio);

            // Ordenar la mitad derecha
            sort(libros, medio + 1, fin);

            // Combinar las dos mitades ordenadas
            merge(libros, inicio, medio, fin);
        }
    }

    // Método para combinar dos subarreglos ordenados
    private static void merge(List<Libro> libros, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        // Crear arreglos temporales
        Libro[] izquierda = new Libro[n1];
        Libro[] derecha = new Libro[n2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < n1; ++i) {
            izquierda[i] = libros.get(inicio + i);
        }
        for (int j = 0; j < n2; ++j) {
            derecha[j] = libros.get(medio + 1 + j);
        }

        // Combinar los arreglos temporales
        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (izquierda[i].getTitulo().compareTo(derecha[j].getTitulo()) <= 0) {
                libros.set(k, izquierda[i]);
                i++;
            } else {
                libros.set(k, derecha[j]);
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de izquierda[] si los hay
        while (i < n1) {
            libros.set(k, izquierda[i]);
            i++;
            k++;
        }

        // Copiar los elementos restantes de derecha[] si los hay
        while (j < n2) {
            libros.set(k, derecha[j]);
            j++;
            k++;
        }
    }
}
