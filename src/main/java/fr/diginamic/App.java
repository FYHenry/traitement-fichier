package fr.diginamic;

import fr.diginamic.utils.CRUD;

/**
 * Application exécutée et interface utilisateur
 */
public class App {
    /** Méthode principale */
    public static void main(String[] args) {
        System.out.println(Runtime.version());
        System.out.println("Salut.");
        CRUD.close();
    }
}
