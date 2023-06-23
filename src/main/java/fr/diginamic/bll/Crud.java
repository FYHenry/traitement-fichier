package fr.diginamic.bll;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class Crud implements AutoCloseable {
    private static Crud crud;
    private final EntityManagerFactory emf;
    private final EntityManager em;
    private Crud(){
        emf = Persistence.createEntityManagerFactory("traitement-fichier");
        em = emf.createEntityManager();
    }
    public static Crud getCrud(){
        if(crud == null){
            crud = new Crud();
        }
        return crud;
    }
    public void create(Object entity){
        this.em.getTransaction().begin();
        this.em.persist(entity);
        this.em.merge(entity);
        this.em.getTransaction().commit();
    }
    public void update(Object object){}
    public void read(Object object){}
    public void delete(Object object){}
    @Override
    public void close() {
        this.em.close();
        this.emf.close();
    }
    public Boolean isOpen(){
        return this.emf.isOpen() && this.em.isOpen();
    }
}
