package fr.diginamic.bll;

import fr.diginamic.bo.Film;
import fr.diginamic.bo.Recordable;
import org.junit.*;

public class CrudTest {
    private static Crud crud;
    private Recordable film = new Film("Nom",
            "URL",
            "Description",
            "Lieu",
            2001);
    @BeforeClass
    public static void setUpClass(){
        crud = Crud.getCrud();
    }
    @AfterClass
    public static void tearDownClass(){
        crud.close();
    }
    @Test
    public void testGetCrud(){
        Assert.assertNotNull("Erreur: L’instance CRUD nulle!",
            crud);
    }
    @Test
    public void testCreate(){
        Assert.assertTrue("Error: N’est pas une entité non nulle!",
                crud.create(film));
    }
    @Test
    public void testUpdate(){
        Assert.assertTrue("Error: N’est pas une entité non nulle!",
                crud.update(film));
    }
    @Test
    public void testRead(){
        Assert.assertTrue("Error: N’est pas une entité non nulle!",
                crud.read(film));
    }
    @Test
    public void testDelete(){
        Assert.assertTrue("Error: N’est pas une entité non nulle!",
                crud.delete(film));
    }
    @Test
    public void testIsOpen(){
        Assert.assertTrue("Erreur: instance CRUD fermée!",
                crud.isOpen());
    }
}
