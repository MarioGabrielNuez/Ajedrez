/**
 * 
 */
package controller.mapping;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public interface Movements {
	enum Directions {
		left(0),
		right(0),
		front(0),
		back(0),
		diagonal(0);
		
		private int numberCells;
		
		Directions(int numberCells) {
			this.numberCells = numberCells;
		}
		
		public int getNumberCells() {return numberCells;}
		
		public void setNumberCells(int numberCells) {
			this.numberCells = numberCells;
		}
	}
	
	public abstract Casillas[] compute(Integer[] movNumber);
}
