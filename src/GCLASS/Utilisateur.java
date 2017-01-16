package GCLASS;

import java.util.Scanner;

public class Utilisateur {
	
	
	/***************************** ATTRIBUTS DE MA SUPER CLASSE ***************************************/

	protected String nom;
	protected String prenom;
	protected String login = nom;
	protected String password = nom;
	protected String statut = "";
	protected int numero;
	
	/******************************* CONSTRUCTEURS ************************************************/
	
	public Utilisateur(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	public Utilisateur(String prenom, String nom, String login, String password, String statut) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.statut = statut;
	}

	public Utilisateur ()
	{
		creerUser();
	}
	
	/******************************** GETTERS AND SETTERS *******************************************/
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	
	/**************** METHODE DE CREATION D UN USER POUR L ADMINISTRATEUR ****************/
	
	public void creerUser() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir le prénom : ");
		prenom = sc.nextLine();
		System.out.println("Saisir le nom (qui sera également le login et mot de passe de notre utilisateur) : ");
		nom = sc.nextLine();
		login = nom;
		password = nom;
		System.out.println("Saisir le statut (responsable, formateur ou étudiant) : ");   //	case à cocher (alexis)
		statut = sc.nextLine();
			}
	
	public String toString() {
		String texte = " Prenom : "+ prenom + "\n Nom : " + nom + "\n Login : "+ login + "\n Mot de passe :" + password + "\n Statut : " + statut+ " ";
		return texte;
	}
	
	/****************METHODE DE MODIFICATION D UN USER POUR L ADMINISTRATEUR****************/
	
	public void modifierPrenom() { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Actuellement le prénom est : " + getPrenom() + "\n Saisir le nouveau prénom : ");
		setPrenom( sc.nextLine());
		//System.out.println("Voici le prénom créé : " +getPrenom());
			}
	
	public void modifierPrenom(String nouveauP) { 
		setPrenom( nouveauP);
			}
	
	public void modifierNom() { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Actuellement le nom est : " + getNom() + "\n Saisir le nouveau nom : ");
		setNom( sc.nextLine());
		//System.out.println("Voici le nom créé : " +getNom());
			}
	
	public void modifierNom(String nouveauN) { 
		setNom( nouveauN);
			}
	
	public void modifierLogin() { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Actuellement l'identifiant est : " + getLogin() + "\n Saisir le nouvel identifiant : ");
		setLogin( sc.nextLine());
		//System.out.println("Voici l'identifiant créé : " +getLogin());
			}
	
	public void modifierLogin(String nouveauL) { 
		setLogin( nouveauL);
			}
	
	public void modifierMP() { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Actuellement le mot de passe est : " + getPassword() + "\n Saisir le nouveau mot de passe : ");
		setPassword( sc.nextLine());
		//System.out.println("Voici le mot de passe créé : " +getPassword());
			}
	
	public void modifierMP(String nouveauMP) { 
		setPassword(nouveauMP);
			}
	
	public void modifierStatut() { 
		Scanner sc = new Scanner (System.in);
		System.out.println("Actuellement le statut est : " + getStatut() + "\n Saisir le nouveau statut : ");
		setStatut( sc.nextLine());
		//System.out.println("Voici le statut créé : " +getStatut());
			}
	
	public void modifierStatut(String nouveauS) { 
		setStatut( nouveauS);
			}

	public void modifierUser(){
		modifierPrenom();
		modifierNom();
		modifierLogin();
		modifierMP();
		modifierStatut();
	}
	

	
	
}
