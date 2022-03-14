package controller;

import java.io.IOException;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		NewThread thread = new NewThread() {
			@Override
			public void run() {
				try {
					new Motor();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		
		thread.run();
	}
}
