package fr.diginamic.bll;

import fr.diginamic.bo.Recordable;
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
    public Boolean create(Recordable entity){
        final Boolean SUCCESS = entity != null;
        if(SUCCESS){
            this.em.getTransaction().begin();
            this.em.persist(entity);
            this.em.merge(entity);
            this.em.getTransaction().commit();
        }
        return SUCCESS;
    }
    public Boolean update(Recordable entity){
        return true;
    }
    public Boolean read(Recordable entity){
        return true;
    }
    public Boolean delete(Recordable entity){
        return true;
    }
    @Override
    public void close() {
        this.em.close();
        this.emf.close();
    }
    public Boolean isOpen(){
        return this.emf.isOpen() && this.em.isOpen();
    }
}
