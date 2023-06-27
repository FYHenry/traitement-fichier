package fr.diginamic.bll;

import fr.diginamic.bo.Film;
import fr.diginamic.bo.Langue;
import fr.diginamic.bo.Pays;
import fr.diginamic.bo.Recordable;
import org.junit.*;

public class CrudTest {
    private static Crud crud;
    private static Pays pays = new Pays("Nulpar", "/");
    private static Langue langue = new Langue("Nulparien","NP");
    private Recordable film = new Film("Nom",
            "URL",
            "Description",
            "Lieu",
            2001,
            pays,
            langue);
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
                crud.create(pays));
        Assert.assertTrue("Error: N’est pas une entité non nulle!",
                crud.create(langue));
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
