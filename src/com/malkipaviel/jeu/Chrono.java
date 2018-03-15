package com.malkipaviel.jeu;

public class Chrono implements Runnable {
	
	private final int PAUSE = 3; //3ms de tour de boucle afin de peindre l'ecran
	
	@Override
	public void run() {
		
		while(true) {
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
		
	}

}
