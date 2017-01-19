package GCLASS;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetreAjouter extends JFrame{

	public FenetreAjouter(){
	JFrame fenetre = new JFrame("Fenêtre fonction ajouter");
	this.setTitle("Ajouter");
	setSize(400,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.getContentPane().setVisible(true);

	JPanel panelFonc = new JPanel();
	JPanel panelFonc2 = new JPanel();
	JPanel panelFonc3 = new JPanel();
	JPanel container = new JPanel();
	JPanel panelid1 = new JPanel ();
	JPanel panelid2 = new JPanel ();
	JPanel panelboutons1 = new JPanel ();
    JLabel prenom = new JLabel("Prenom :");
	JLabel nom = new JLabel("Nom :");
	JLabel login = new JLabel("Login :");
	JLabel mdp = new JLabel("Mot de passe :");
	JLabel statut = new JLabel("Statut :");
	JTextField nomtext = new JTextField();
	JTextField prenomtext = new JTextField();
	JTextField statutext = new JTextField();
	JComboBox<Object> statutCombo = new JComboBox<>();
	JButton boutonOk = new JButton("Ok");
	JTextField login2 = new JTextField();
	JPasswordField mdp2 = new JPasswordField();
	
	container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
	panelid1.setLayout(new BoxLayout(panelid1, BoxLayout.LINE_AXIS));
	panelid1.add(prenom);
	prenom.setPreferredSize(new Dimension(140, 20));
	panelid1.add(prenomtext);
	prenomtext.setPreferredSize(new Dimension(200, 20));

	panelid2.setLayout(new BoxLayout(panelid2, BoxLayout.LINE_AXIS));
	panelid2.add(nom);
	nom.setPreferredSize(new Dimension(140, 20));
	panelid2.add(nomtext);
	nomtext.setPreferredSize(new Dimension(200, 20));

	panelFonc.setLayout(new BoxLayout(panelFonc, BoxLayout.LINE_AXIS));
	panelFonc.add(login);
	login.setPreferredSize(new Dimension(140, 20));
	panelFonc.add(login2);
	login2.setPreferredSize(new Dimension(200, 20));

	panelFonc2.setLayout(new BoxLayout(panelFonc2, BoxLayout.LINE_AXIS));
	panelFonc2.add(mdp);
	mdp.setPreferredSize(new Dimension(140, 20));
	panelFonc2.add(mdp2);
	mdp2.setPreferredSize(new Dimension(200, 20));

	panelFonc3.setLayout(new BoxLayout(panelFonc3, BoxLayout.LINE_AXIS));
	panelFonc3.add(statutCombo);
	statutCombo.addItem("Etudiant");
	statutCombo.addItem("Formateur");
	statutCombo.addItem("Responsable Pedagogique");
	statutCombo.addItem("Admin");

	panelboutons1.setLayout(new BoxLayout(panelboutons1, BoxLayout.LINE_AXIS));
	panelboutons1.add(boutonOk);

	container.add(panelid1);
	container.add(panelid2);
	container.add(panelFonc);
	container.add(panelFonc2);
	container.add(panelFonc3);
	container.add(panelboutons1);
	
	

	setContentPane(container);
	setVisible(true);
	}
}
