package livreheros;

public class Objet
{ 
	private String description;
	private int valeur;
	
	public Objet(String description, int valeur)
	{ 
		this.description = description;
		this.valeur = valeur;
	} 
	
	public String toString()
	{ 
		return getDescription() + " de valeur :" + valeur;
	} 
	
	public String getDescription()
	{
		return description;
	} 
}
