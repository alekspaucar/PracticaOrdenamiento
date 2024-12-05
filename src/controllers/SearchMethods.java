package controllers;

import models.Person;

public class SearchMethods {

    public int sequentialSearchByName(Person[] personas, String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getName().equalsIgnoreCase(nombre)) {
                return i; // Retorna el índice donde se encuentra la persona.
            }
        }
        return -1; // Retorna -1 si no se encuentra.
    }

    public int binarySearchByName(Person[] personas, String nombre) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = personas[medio].getName().compareToIgnoreCase(nombre);

            if (comparacion == 0) {
                return medio; // Retorna el índice donde se encuentra la persona.
            }

            if (comparacion < 0) {
                inicio = medio + 1; // Busca en la mitad derecha.
            } else {
                fin = medio - 1; // Busca en la mitad izquierda.
            }
        }
        return -1; // Retorna -1 si no se encuentra.
    }
}
