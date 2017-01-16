package GCLASS;

import java.util.Scanner;

public class Salle {

	private String nom;
	private int nbplace;
	private boolean occupation=false;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbplace() {
		return nbplace;
	}
	public void setNbplace(int nbplace) {
		this.nbplace = nbplace;
	}
	public boolean isOccupation() {
		return occupation;
	}
	public void setOccupation(boolean occupation) {
		this.occupation = occupation;
	}
	public Salle(String nom, int nbplace) {
		super();
		this.nom = nom;
		this.nbplace = nbplace;
	}
	public Salle() {
		ajoutSalle();
	}
	public void ajoutSalle(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nom de la salle :");
		nom=sc.nextLine();
		System.out.println("Saisir la capacit� de la salle :");
		nbplace=sc.nextInt();
	}
	public void modifSalle(){
		modifNom();
		modifCapacite();
	}

	public void modifSalle(String nouveau, int nvcap){
		modifNom(nouveau);
		modifCapacite(nvcap);
	}
	public void modifNom(){
		String ancien=getNom();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nouveau nom de la salle :");
		nom=sc.nextLine();
		System.out.println("Le nom de la salle est pass� de "+ancien+" � "+nom);
	}
	public void modifNom(String nouveau){
		String ancien=getNom();
		setNom(nouveau);
		System.out.println("Le nom de la salle est pass� de "+ancien+" � "+nom);
	}
	public void modifCapacite(){
		int ancien=getNbplace();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle capacit� de la salle :");
		nbplace=sc.nextInt();
		System.out.println("La capacit� de la salle "+ nom + " est pass� de "+ancien+" � "+nbplace+ " personnes");
	}
	public void modifCapacite(int nouveau){
		int ancien=getNbplace();
		setNbplace(nouveau);
		System.out.println("La capacit� de la salle "+ nom + "est pass� de "+ancien+" � "+nbplace+ " personnes");;
	}
	
	public String toString (){
		String texte= "Nom de la salle : "+ nom + "\nCapacit� d'accueil : "+  nbplace + " personnes";
		return texte;
	}
	public void suppSalle(){}
	
}
