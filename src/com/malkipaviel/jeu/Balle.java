package com.malkipaviel.jeu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Balle extends JPanel{
//
//	/*private ImageIcon icoBouleBleu;
//	private Image imgBouleBleu;
//	
//	public Balle(){
//	this.icoBouleBleu = new ImageIcon(getClass().getResource("/image/bleu.png"));
//	this.imgBouleBleu = this.icoBouleBleu.getImage();
//	}
//	
//	public Image getImgBoule() {
//		return imgBouleBleu;
//	}
	
	int diameter=30;
	float xpos = 170;
	float ypos = 500;
	float vy = 0;
	float gravity = 0.3f;
	
	void gravity() {
		
		ypos+=vy;
		vy+=gravity;
		if(ypos>500) {
			vy=-vy;
			ypos=500;
		}
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.setColor(Color.BLUE);
	    g.fillOval((int)xpos, (int)ypos, (int)diameter, (int)diameter);
	    this.gravity();
	    System.out.println(ypos);
	  }
	
	
	  
	  
}
