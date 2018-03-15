package com.malkipaviel.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
		
		JFrame fenetre = new JFrame("Jeu du Color Switch");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fermer le programme quand on ferme la fenetre	
		fenetre.setSize(360, 700); //Taille
		fenetre.setLocationRelativeTo(null); //Centrer sur l'ecran
		fenetre.setResizable(false); //Pas redimensionnable
		fenetre.setAlwaysOnTop(true); //La fenetre sera tout le temps au premier plan

		scene = new Scene();
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
