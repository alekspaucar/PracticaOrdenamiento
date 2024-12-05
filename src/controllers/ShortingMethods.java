package controllers;

import models.Person;

public class ShortingMethods {

    void sortByNameWithBuble(Person[] personas) {
        int n = personas.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getPersona().compareToIgnoreCase(personas[j + 1].getPersona()) > 0) {
                    // Intercambia los objetos
                    Person temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;

                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) {
                break;
            }
        }
    }

    void sortByNameWithSelectio(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el índice del menor elemento en la parte no ordenada
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (personas[j].getPersona().compareToIgnoreCase(personas[minIndex].getPersona()) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Person temp = personas[i];
                personas[i] = personas[minIndex];
                personas[minIndex] = temp;
            }
        }
    }
}
