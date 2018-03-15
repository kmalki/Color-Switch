package com.malkipaviel.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	final int centerx=180;
	final int centery=350;
	public Balle b;
	public Obstacle ob;
	private ImageIcon icoFond;
	private Image imgFond;
	private Image imgFond2;
	
	
	
	private int xFond;
	private int yFond;
	private int yFond2;
	private int dx;
	private int dy;
	
	public Scene() {
		
		super();
		icoFond = new ImageIcon(getClass().getResource("/image/fond-jeu3.png"));
		this.imgFond = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		this.xFond = 0;
		this.yFond = 0;
		this.yFond2 = -700;
		this.dy = 0;
		b=new Balle();
		ob=new Obstacle();
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
		
	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public void deplacementFond() {
		this.yFond = this.yFond - this.dy;
		this.yFond2 = this.yFond2 - this.dy;
		if(this.yFond == 700) {
			this.yFond = -700;
		}
		else if(this.yFond2 == 700) {
			this.yFond2 = -700;	
		}
	}
	
	public void paintComponent(Graphics g) { //Dessin
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		this.deplacementFond();
		
		g2.drawImage(this.imgFond, this.xFond, this.yFond ,null); //Dessin du fond.
		g2.drawImage(this.imgFond, this.xFond, this.yFond2 ,null); //Dessin du fond.
//		g2.drawImage(b.getImgBoule(),150, 450, null);
		b.paintComponent(g2);
	}

}
