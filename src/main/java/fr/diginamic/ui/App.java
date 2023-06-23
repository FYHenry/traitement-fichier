package fr.diginamic.ui;

import fr.diginamic.bll.Crud;

/**
 * Application exécutée et interface utilisateur
 */
public class App {
    /** Méthode principale */
    public static void main(String[] args) {
        System.out.println(Runtime.version());
        System.out.println("Salut.");
        try(Crud crud = Crud.getCrud()){
            isOpen(crud);
        }
    }
    private static void isOpen(Crud crud){
        if(crud.isOpen()){
            System.out.println("Gestionnaire encore ouvert.");
        } else {
            System.out.println("Gestionnaire déjà fermé.");
        }
    }
}
