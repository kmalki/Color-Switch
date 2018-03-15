package com.malkipaviel.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.scene.setDy(-1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.setDy(0);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

}
