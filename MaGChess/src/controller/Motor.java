package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import controller.mapping.Casillas;
import view.graphics.Pieces;
import view.graphics.RareColors;
import view.graphics.BoardEstructure;
import view.graphics.Borders;
import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Motor implements BoardEstructure, Borders, RareColors{
	private static JLabel colaider;
	private static Pieces pieza;
	private static JPanel celdaOri = new JPanel();
	private static Color colorOri = null;
	
	public static void run() throws IOException {
		for (int i = 0;i<8;i++) {
			for (int x = 0;x<8;x++) {
				JPanel celda = celdas[i][x];
				
				celda.addMouseListener(new MouseInputListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (!Arrays.asList(celda.getComponents()).isEmpty()) {
							if (colaider == null) {
								for (Casillas c: Casillas.values()) {
									if ((celda.getX() + celda.getY()) == (c.getCasilla().getX() + c.getCasilla().getY())) {
										pieza = c.getPieza();
										pieza.grab(celda);
										break;
									}
								}
							} else {
								for (Casillas c: Casillas.values()) {
									if ((celda.getX() + celda.getY()) == (c.getCasilla().getX() + c.getCasilla().getY()) && c.getPieza().getColor() != pieza.getColor()) {
										pieza.eat(celda, c);
										break;
									}
								}
							}
						} else {
							if (Arrays.asList(celda.getComponents()).isEmpty() && colaider != null) {
								for (Casillas c: Casillas.values()) {
									if ((celdaOri.getX() + celdaOri.getY()) == (c.getCasilla().getX() + c.getCasilla().getY())) {				
										pieza.move(celda, c);
										break;
									}									
								}
							}
						}
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						celda.updateUI();
						
						if (!Arrays.asList(celdaOri.getComponents()).isEmpty()) {
							celdaOri.updateUI();
						}
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						if (colaider != null) {
							if (Arrays.asList(celda.getComponents()).isEmpty()) {
								celda.setBorder(green);
							} else {
								celda.setBorder(red);
								
								for (Casillas c: Casillas.values()) {
									if ((celda.getX() + celda.getY()) == (c.getCasilla().getX() + c.getCasilla().getY()) && c.getPieza().getColor() != pieza.getColor()) {
										celda.setBorder(green);
										break;
									} else if(c != null) {
										celda.setBorder(red);
									}
								}
							}
						} else {
							if (!Arrays.asList(celda.getComponents()).isEmpty()) {
								celda.setBorder(green);
							} else {
								celda.setBorder(red);
							}
						}
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						celda.setBorder(null);
					}

					@Override
					public void mouseDragged(MouseEvent e) {}

					@Override
					public void mouseMoved(MouseEvent e) {}

					@Override
					public void mousePressed(MouseEvent e) {}
				});
			}
		}
	}
	
	public static Pieces NewPiece(String color, Pieces.Types piece) throws IOException {
		Pieces pieza = new Pieces("src/view/assets/" + piece + "-" + color + ".png", color, piece){

			@Override
			public void grab(JPanel celda) {
				celdaOri = celda;
				colorOri = celdaOri.getBackground();
				colaider = (JLabel) celdaOri.getComponents()[0];
				celda.setBorder(red);
				celda.setBackground(Color.orange);

				this.getPiece().addMovement(switch (this.getPiece()) {
					case peon -> new ArrayList<Directions>(Arrays.asList(Directions.front, 
																		 Directions.diagonal
																		));  
					
					case torre -> new ArrayList<Directions>(Arrays.asList(Directions.front, 
																		  Directions.back,
																		  Directions.left,
																		  Directions.right
																		 ));  
					case caballo -> new ArrayList<Directions>(Arrays.asList(Directions.front, 
																		    Directions.back,
																		    Directions.left,
																		    Directions.right
																		   ));  
					
					case alfil -> new ArrayList<Directions>(Arrays.asList(Directions.diagonal)); 
					
					case reina -> new ArrayList<Directions>(Arrays.asList(Directions.front, 
																		  Directions.back,
																	      Directions.left,
																	      Directions.right, 
																	      Directions.diagonal
																	     ));  
					
					case rey -> new ArrayList<Directions>(Arrays.asList(Directions.front, 
																	    Directions.back,
																        Directions.left,
																        Directions.right, 
																        Directions.diagonal
																       ));
				});
				
				compute(switch (this.getPiece()) {
							case peon -> new Integer[] {1, 2};
							case alfil -> new Integer[] {-1};
							case caballo -> new Integer[] {4};
							case reina -> new Integer[] {-1};
							case rey -> new Integer[] {1};
							case torre -> new Integer[] {-1};
						});
				
				System.out.println(this.getPiece() + " -> " + this.getPiece().getMovement() + " / ");
			}

			@Override
			public void eat(JPanel celda, Casillas c) {
				c.setCasilla(celda);
				c.setPieza(this);
				if (colaider != null) celdaOri.remove(colaider);
				
				if (colorOri == _gray) {
					celdaOri.setBackground(_gray);
				} else {
					celdaOri.setBackground(null);
				}
				
				celda.remove((JLabel) celda.getComponents()[0]);
				celda.add(colaider);
				colaider = null;
			}

			@Override
			public void move(JPanel celda, Casillas c) {
				c.setCasilla(celda);
				c.setPieza(this);
				if (colaider != null) celdaOri.remove(colaider);
				
				if (colorOri == _gray) {
					celdaOri.setBackground(_gray);
				} else {
					celdaOri.setBackground(null);
				}
				
				celda.add(colaider);
				colaider = null;
			}

			@Override
			public Casillas[] compute(Integer[] movNumber) {
				return null;
			}
		};
		
		return pieza;
	}
}
