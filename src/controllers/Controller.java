package controllers;

import models.Person;
import view.View;

public class Controller {

    private View view;
    private ShortingMethods shortingMethods;
    private SearchMethods searchMethod;

    private Person[] personas;

    public Controller(View view, ShortingMethods shortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.shortingMethods = shortingMethods;
        this.searchMethod = searchMethods;
        System.out.println("controller creator");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersonas();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPerson();
                    break;
                case 100:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 100);
    }

    public void inputPersonas() {
        int numeroPersonas = view.inputInt("Ingrese el número de personas: ");
        personas = new Person[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    public void addPerson() {
        if (personas == null) {
            view.showMensajae("No hay datos, ingresando nuevas personas.");
            inputPersonas();
        } else {
            int numeroPersonas = view.inputInt("Ingrese el número de personas a adicionar: ");
            Person[] personasTotales = new Person[personas.length + numeroPersonas];

            for (int i = 0; i < personas.length; i++) {
                personasTotales[i] = personas[i];
            }

            for (int i = personas.length; i < personasTotales.length; i++) {
                personasTotales[i] = view.inputPerson();
            }

            personas = personasTotales;
        }
    }

    public void sortPerson() {
        int sortingOption = view.selectSortingMethod();

        if (sortingOption == 1) {
            shortingMethods.sortByNameWithBuble(personas);
        } else if (sortingOption == 2) {
            shortingMethods.sortByNameWithSelectio(personas);
        } else {
            view.showMensajae("Opción no válida");
        }
    }
}

