package fr.diginamic.ui;

import fr.diginamic.bll.Crud;
import fr.diginamic.bll.JsonEditor;
import fr.diginamic.bo.Film;
import fr.diginamic.bo.Langue;
import fr.diginamic.bo.Pays;
import fr.diginamic.bo.Recordable;

import java.io.IOException;
import java.util.List;

/**
 * Application exécutée et interface utilisateur
 */
public class App {

    private static final Pays pays = new Pays("Nulpar", "/");
    private static final Langue langue = new Langue("Nulparien","NP");
    private static final Film film = new Film("Nom",
            "URL",
            "Description",
            "Lieu",
            2001,
            pays,
            langue);
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
