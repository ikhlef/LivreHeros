package livreheros;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Livre here.
 * 
 * @author (Rafik & Ahmed) 
 * @version (a version 1.0 date 20.01.2017)
 */
public class Livre
{
    // instance variables - replace the example below with your own
    private String titre;
    private int numero;
    private static int compteurLivre = 1;
    private Section init;
    private List<Section> liste;
    
    public Livre(String titre)
    {
        this.titre= titre;
        this.numero =compteurLivre++;
        this.liste = new ArrayList<Section>();
    }
    
    public Livre(Section init, String titre)
    {
       this.titre = titre;
       this.numero = compteurLivre++;
       this.init = init ;
       this.liste = new ArrayList<Section>();
    }
    
    public void ajouterSection(Section section){
    	if(! this.liste.contains(section))
    	{
    		liste.add(section);
    	}
    }
    
    public List<Section> getListeSection()
    {
    	return this.liste;
    }
    
    public int getTailleListe()
    {
    	return this.liste.size();
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public void setTitre(String c){
        this.titre=c;
    }
    
    public String afficherLivre(){
        return "livre numero "+ this.numero + ",titre : "+ this.titre ;
    }
    
    public Section getSectionInitiale()
    {
        return this.init ;
    }
    
    public String texteSectionInitiale()
    {
        return getSectionInitiale().getTexte();
    }
    
    public void afficherSectionLivre(){
    	listeParcourir();
    }

	private void listeParcourir() {
		for(Section s : liste){
    		s.afficherSection();
    	}
	}
    
    
    
    
}
