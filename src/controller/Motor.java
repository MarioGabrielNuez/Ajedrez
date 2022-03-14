package controller;

import java.io.IOException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import graphics.Pieces;
import graphics.Tablero;
import java.awt.event.MouseEvent;
import java.awt.Color;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Motor extends Tablero{
	JLabel colaider;
	JLabel subsColaider;
	Pieces pieza;
	JPanel celdaOri = new JPanel();
	
	public Motor() throws IOException {
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
										celdaOri = celda;
										colaider = (JLabel) celdaOri.getComponents()[0];
										celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
									}
								}
							} else {
								for (Casillas c: Casillas.values()) {
									if ((celda.getX() + celda.getY()) == (c.getCasilla().getX() + c.getCasilla().getY()) && c.getPieza().getColor() != pieza.getColor()) {
										subsColaider = (JLabel) celda.getComponents()[0];
										c.setCasilla(celda);
										c.setPieza(pieza);
										celdaOri.remove(colaider);
										celda.remove(subsColaider);
										celda.add(colaider);
										colaider = null;
										subsColaider = null;
									}
								}
							}
						} else {
							if (Arrays.asList(celda.getComponents()).isEmpty() && colaider != null) {
								for (Casillas c: Casillas.values()) {
									if ((celdaOri.getX() + celdaOri.getY()) == (c.getCasilla().getX() + c.getCasilla().getY())) {				
										c.setCasilla(celda);
										c.setPieza(pieza);
										celdaOri.remove(colaider);
										celda.add(colaider);
										colaider = null;
									}									
								}
							}
						}
					}

					@Override
					public void mousePressed(MouseEvent e) {}

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
								celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
							} else {
								celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
								
								for (Casillas c: Casillas.values()) {
									if ((celda.getX() + celda.getY()) == (c.getCasilla().getX() + c.getCasilla().getY()) && c.getPieza().getColor() != pieza.getColor()) {
										celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
									}
								}
							}
						} else {
							if (!Arrays.asList(celda.getComponents()).isEmpty()) {
								celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
							} else {
								celda.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
							}
						}
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						celda.setBorder(BorderFactory.createEmptyBorder());
					}

					@Override
					public void mouseDragged(MouseEvent e) {}

					@Override
					public void mouseMoved(MouseEvent e) {}
				});
			}
		}
	}
}
