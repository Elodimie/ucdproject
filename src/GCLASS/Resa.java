package GCLASS;

import java.util.Scanner;

public class Resa {
	private String salle;
	private String cours;
	private String promo;
	private String prof;
	private MaDate date;
	private int idcours;
	private int idsalle;
	private int idpromo;
	private int idprof;
	
	public Resa( String salle, String cours, String promo, String prof, MaDate date) {
		super();
		this.salle = salle;
		this.cours = cours;
		this.promo = promo;
		this.prof = prof;
		this.date = date;
	}
	public Resa() {
		ajoutResa();
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	public MaDate getDate() {
		return date;
	}
	public void setDate(MaDate date) {
		this.date = date;
	}

	public int getIdcours() {
		return idcours;
	}
	public int getIdsalle() {
		return idsalle;
	}
	public int getIdpromo() {
		return idpromo;
	}

	public int getIdprof() {
		return idprof;
	}	
// méthodes 
	public void ajoutResa() {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Saisir le nom de la salle :");
		salle=sc.nextLine();
		System.out.println("Saisir le nom du cours  :");
		cours=sc.nextLine();
		System.out.println("Saisir le nom du promo  :");
		promo=sc.nextLine();
		System.out.println("Saisir le nom du formateur  :");
		prof=sc.nextLine();
		System.out.println("Saisir le jour de la réservation");
		int jour=sc.nextInt();
		System.out.println("Saisir le mois de la réservation");
		int mois=sc.nextInt();
		System.out.println("Saisir l'année de la réservation");
		int annee=sc.nextInt();
		date=new MaDate(jour, mois, annee);
	}	
	public void modifResa (String nvsalle, String nvcours, String nvpromo, String nvformateur, MaDate nvdate){ 	
		modifPromoR(nvpromo);
		modifSalleR(nvsalle);
		modifCoursR(nvcours);
		modifProfR(nvformateur);
		modifDate(nvdate);
	}	
	public void modifResa() {
	}	
	
	public void modifSalleR() {
		String ancien=getSalle();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle  salle qui sera affectée :");
		salle=sc.nextLine();
		System.out.println("La salle est passée de "+ancien+" à "+salle);	
	}
	public void modifSalleR(String nouveau) {
		setSalle(nouveau);
	}
	
	public void modifCoursR(){	
		String ancien=getCours();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nouvveau cours qui sera affecté :");
		cours=sc.nextLine();
		System.out.println("Le cours est passé de "+ancien+" à "+salle);
	}	
	public void modifCoursR(String nouveau) {
		setCours(nouveau);	
	}
	
	public void modifPromoR() {
		String ancien=getPromo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle promotion qui sera affectée :");
		promo=sc.nextLine();
		System.out.println("La promotion est passée de "+ancien+" à "+promo);	
	}
	public void modifPromoR(String nouveau) {
		setPromo(nouveau);
	}
	
	public void modifProfR() {
		String ancien=getPromo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir le nom du nouveau formateur qui sera affectée :");
		prof=sc.nextLine();
		System.out.println("Le formateur est passé de "+ancien+" à "+prof);	
	}
	public void modifProfR(String nouveau) {
		setProf(nouveau);
	}
	
	public void modifDate() {
		MaDate ancien=getDate();
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir la nouvelle date de la réservation");
		System.out.println("- le jour : ");
		int jour=sc.nextInt();
		System.out.println("- le mois : ");
		int mois=sc.nextInt();
		System.out.println(" - l'année :");
		int annee=sc.nextInt();
		date=new MaDate(jour, mois, annee);
		System.out.println("La date est passé de "+ancien+" à "+date);			
	}
	public void modifDate(MaDate nouveau) {
		setDate(nouveau);
	}
	
	public void suppResa() {	
	}	
	
}
