package fr.diginamic.bll;

import org.junit.Assert;
import org.junit.Test;

public class CrudTest {
    @Test
    public void testGetCrud(){
        try(Crud crud = Crud.getCrud()){
            Assert.assertNotNull("Erreur: ",
                    crud);
        }
    }
    @Test
    public void testisOpen(){
        try(Crud crud = Crud.getCrud()){
            Assert.assertTrue("Erreur: instance CRUD fermée!",
                    crud.isOpen());
        }
    }
}
