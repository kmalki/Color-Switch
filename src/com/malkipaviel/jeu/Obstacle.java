package com.malkipaviel.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Obstacle {

	private ImageIcon icoObstacle;
	private Image imgObstacle;
	
	public Obstacle(){
	this.icoObstacle = new ImageIcon(getClass().getResource("/image/rose.png"));
	this.imgObstacle = this.icoObstacle.getImage();
	}
	
	public Image getImgObstacle() {
		return imgObstacle;
	}
}
