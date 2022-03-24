package controller;

import java.io.IOException;
import view.graphics.Board;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class MaGChess {
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		NewThread thread = new NewThread() {
			@Override
			public void run() {
				try {
					Motor.run();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Board();
		thread.run();
	}
}
