package view.graphics;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
import controller.mapping.Casillas;
import controller.mapping.Movements;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public abstract class Pieces implements Movements {
	public enum Types {
		peon(new ArrayList<Directions>()), 
		torre(new ArrayList<Directions>()), 
		caballo(new ArrayList<Directions>()), 
		alfil(new ArrayList<Directions>()), 
		reina(new ArrayList<Directions>()), 
		rey(new ArrayList<Directions>());
		
		private ArrayList<Directions> movement = new ArrayList<Directions>();
			
		Types(ArrayList<Directions> movement) {
			this.movement.addAll(movement);
		}

		public ArrayList<Directions> getMovement() {return movement;}
		
		public void addMovement(ArrayList<Directions> movement) {
			this.movement.clear();
			this.movement.addAll(movement);
		}
	}
	
	private String path;
	private String color;
	private Types piece;
	
	public Pieces(String path, String color, Types piece) throws IOException {
		this.path = path;
		this.color = color;
		this.piece = piece;
	}
	
	public String getPath() {return path;}
	public String getColor() {return color;}
	public Types getPiece() {return piece;}
	
	public abstract void grab(JPanel celda);
	public abstract void eat(JPanel celda, Casillas c);
	public abstract void move(JPanel celda, Casillas c);
}
