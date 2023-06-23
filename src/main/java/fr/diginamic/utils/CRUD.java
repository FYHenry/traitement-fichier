package fr.diginamic.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public final class CRUD {
    private static final EntityManagerFactory emf;
    private static final EntityManager em;
    static {
        emf = Persistence.createEntityManagerFactory("traitement-fichier");
        em = emf.createEntityManager();
    }
    private CRUD(){}
    public static void create(Object object){}
    public static void update(Object object){}
    public static void read(Object object){}
    public static void delete(Object object){}
    public static void close() {
        em.close();
        emf.close();
    }
}
