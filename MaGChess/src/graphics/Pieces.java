package graphics;

import java.io.IOException;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Pieces{
	enum Types {
		peon, 
		torre, 
		caballo, 
		alfil, 
		reina, 
		rey;
	}
	
	private String path;
	private String color;
	
	public Pieces(String path, String color) throws IOException {
		this.path = path;
		this.color = color;
	}
	
	public String getPath() {return path;}
	public String getColor() {return color;}
}
