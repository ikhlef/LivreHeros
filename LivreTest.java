package livreheros;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LivreTest.
 *
 * @author  (Rafik & Ahmed)
 * @version (1.0)
 */
public class LivreTest
{
    private Section section1,section2,init,centrale;
    private Livre livre1;
    
    public LivreTest()
    {
    }
   
    @Before
    public void setUp()
    {
        section1 = new Section("introduction");
        section2 = new Section("chapitre1");
        livre1 = new Livre(section1, "mail");
        livre1.ajouterSection(section2);
        livre1.ajouterSection(section2);
        
        init = new Section("bienvenue");
        centrale = new Section("milieu");
        init.ajouterEnchainement("choix fin",centrale); 
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testAfficherLivre()
    {
        assertEquals("livre numero 1,titre : mail", livre1.afficherLivre());
    }

    @Test
    public void testTexteSectionInitiale()
    {
        assertEquals("introduction", livre1.texteSectionInitiale());
    }
    
    @Test
    public void testTailleListeSection()
    {
        assertEquals(1, livre1.getTailleListe());
    }
    
    @Test
    public void testAjouterEnchainement()
    {
        assertEquals("milieu", init.getSuivantes().get(0).getTexte());
        assertEquals("choix fin", init.getEnchainements().get(0));
    }
}
