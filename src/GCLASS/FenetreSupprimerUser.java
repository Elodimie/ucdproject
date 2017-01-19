package GCLASS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FenetreSupprimerUser extends JFrame{

			public FenetreSupprimerUser(){
			JFrame fenetre = new JFrame("Fenêtre fonction Supprimer");
			this.setTitle("Supprimer");
			setSize(400,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.getContentPane().setVisible(true);

			JPanel panelFonc = new JPanel();
			JPanel container = new JPanel();
			JPanel panelid1 = new JPanel ();
			JPanel panelid2 = new JPanel ();
			JPanel panelboutons1 = new JPanel ();
		    JLabel avertissement = new JLabel("<html>ATTENTION, Vous êtes sur le point de <br> supprimer le compte : </html>", SwingConstants.CENTER);
		    avertissement.setForeground(Color.red);
		 	JLabel nom = new JLabel("Nom :");
			JLabel prenom = new JLabel("Prénom");
			JTextField nomtext = new JTextField();
			JTextField prenomtext = new JTextField();
			JButton boutonOk = new JButton("Confirmer");
			JButton boutonCancel = new JButton("Annuler");
			
			container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
			panelid1.setLayout(new BoxLayout(panelid1, BoxLayout.LINE_AXIS));
			panelFonc.add(avertissement);
			container.add(panelFonc);
			panelid1.add(prenom);
			prenom.setPreferredSize(new Dimension(100, 20));
			panelid1.add(prenomtext);
			prenomtext.setPreferredSize(new Dimension(100, 20));

			panelid2.setLayout(new BoxLayout(panelid2, BoxLayout.LINE_AXIS));
			panelid2.add(nom);
			nom.setPreferredSize(new Dimension(100, 20));
			panelid2.add(nomtext);
			nomtext.setPreferredSize(new Dimension(100, 20));


			panelboutons1.setLayout(new BoxLayout(panelboutons1, BoxLayout.LINE_AXIS));
			panelboutons1.add(boutonOk);
			panelboutons1.add(boutonCancel);
			container.add(panelid1);
			container.add(panelid2);

			container.add(panelboutons1);
			
			
			setContentPane(container);
			setVisible(true);
			}
		
	}


