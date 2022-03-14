package graphics;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.Casillas;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Tablero extends Window implements Casillas {	
	protected JPanel[][] celdas = null;
	
	/**
	 * constructor del tablero
	 * @throws IOException 
	 */
	public Tablero() throws IOException {
		celdas = new JPanel[][] {
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}
		};
		
		for (int i = 0;i<8;i++) {
			for (int x = 0;x<8;x++) {
				celdas[i][x].setLayout(new GridLayout(8, 8, 0, 0));
				
				if (i % 2 == 0) {
					if (x % 2 != 0) {
						celdas[i][x].setBackground(new Color(176,190,197));
					}
				} else {
					if (x % 2 == 0) {
						celdas[i][x].setBackground(new Color(176,190,197));	
					}
				}
				
				if (i == 0) {
					if (x == 0 || x == 7) {
						Pieces pieza = NewPiece("negro", Pieces.Types.torre);
						
						if (x == 0) {
							Casilla._1A.setCasilla(celdas[i][x]);
							Casilla._1A.setPieza(pieza);
						} else if (x == 7) {
							Casilla._1H.setCasilla(celdas[i][x]);
							Casilla._1H.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 1 || x == 6) {
						Pieces pieza = NewPiece("negro", Pieces.Types.caballo);
						
						if (x == 1) {
							Casilla._1B.setCasilla(celdas[i][x]);
							Casilla._1B.setPieza(pieza);
						} else if (x == 6) {
							Casilla._1G.setCasilla(celdas[i][x]);
							Casilla._1G.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 2 || x == 5) {
						Pieces pieza = NewPiece("negro", Pieces.Types.alfil);
						
						if (x == 2) {
							Casilla._1C.setCasilla(celdas[i][x]);
							Casilla._1C.setPieza(pieza);
						} else if (x == 5) {
							Casilla._1F.setCasilla(celdas[i][x]);
							Casilla._1F.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 3) {
						Pieces pieza = NewPiece("negro", Pieces.Types.reina);
						
						Casilla._1D.setCasilla(celdas[i][x]);
						Casilla._1D.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
					
					if (x == 4) {
						Pieces pieza = NewPiece("negro", Pieces.Types.rey);
						
						Casilla._1E.setCasilla(celdas[i][x]);
						Casilla._1E.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
				}
				
				if (i == 1) {
					Pieces pieza = NewPiece("negro", Pieces.Types.peon);
					
					switch (x) {
					case 0: 
						Casilla._2A.setCasilla(celdas[i][x]);
						Casilla._2A.setPieza(pieza);
						break;
					case 1: 
						Casilla._2B.setCasilla(celdas[i][x]);
						Casilla._2B.setPieza(pieza);
						break;
					case 2: 
						Casilla._2C.setCasilla(celdas[i][x]);
						Casilla._2C.setPieza(pieza);
						break;
					case 3: 
						Casilla._2D.setCasilla(celdas[i][x]);
						Casilla._2D.setPieza(pieza);
						break;
					case 4: 
						Casilla._2E.setCasilla(celdas[i][x]);
						Casilla._2E.setPieza(pieza);
						break;
					case 5: 
						Casilla._2F.setCasilla(celdas[i][x]);
						Casilla._2F.setPieza(pieza);
						break;
					case 6: 
						Casilla._2G.setCasilla(celdas[i][x]);
						Casilla._2G.setPieza(pieza);
						break;
					case 7: 
						Casilla._2H.setCasilla(celdas[i][x]);
						Casilla._2H.setPieza(pieza);
						break;
					}

					PlacePieces(i, x, pieza);
				}
				
				if (i == 7) {
					if (x == 0 || x == 7) {
						Pieces pieza = NewPiece("blanco", Pieces.Types.torre);
						
						if (x == 0) {
							Casilla._8A.setCasilla(celdas[i][x]);
							Casilla._8A.setPieza(pieza);
						} else if (x == 7) {
							Casilla._8H.setCasilla(celdas[i][x]);
							Casilla._8H.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 1 || x == 6) {
						Pieces pieza = NewPiece("blanco", Pieces.Types.caballo);
						
						if (x == 1) {
							Casilla._8B.setCasilla(celdas[i][x]);
							Casilla._8B.setPieza(pieza);
						} else if (x == 6) {
							Casilla._8G.setCasilla(celdas[i][x]);
							Casilla._8G.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 2 || x == 5) {
						Pieces pieza = NewPiece("blanco", Pieces.Types.alfil);
						
						if (x == 2) {
							Casilla._8C.setCasilla(celdas[i][x]);
							Casilla._8C.setPieza(pieza);
						} else if (x == 5) {
							Casilla._8F.setCasilla(celdas[i][x]);
							Casilla._8F.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 3) {
						Pieces pieza = NewPiece("blanco", Pieces.Types.reina);
						
						Casilla._8D.setCasilla(celdas[i][x]);
						Casilla._8D.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
					
					if (x == 4) {
						Pieces pieza = NewPiece("blanco", Pieces.Types.rey);
						
						Casilla._8E.setCasilla(celdas[i][x]);
						Casilla._8E.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
				}
				
				if (i == 6) {
					Pieces pieza = NewPiece("blanco", Pieces.Types.peon);
					
					switch (x) {
					case 0: 
						Casilla._7A.setCasilla(celdas[i][x]);
						Casilla._7A.setPieza(pieza);
						break;
					case 1: 
						Casilla._7B.setCasilla(celdas[i][x]);
						Casilla._7B.setPieza(pieza);
						break;
					case 2: 
						Casilla._7C.setCasilla(celdas[i][x]);
						Casilla._7C.setPieza(pieza);
						break;
					case 3: 
						Casilla._7D.setCasilla(celdas[i][x]);
						Casilla._7D.setPieza(pieza);
						break;
					case 4: 
						Casilla._7E.setCasilla(celdas[i][x]);
						Casilla._7E.setPieza(pieza);
						break;
					case 5: 
						Casilla._7F.setCasilla(celdas[i][x]);
						Casilla._7F.setPieza(pieza);
						break;
					case 6: 
						Casilla._7G.setCasilla(celdas[i][x]);
						Casilla._7G.setPieza(pieza);
						break;
					case 7: 
						Casilla._7H.setCasilla(celdas[i][x]);
						Casilla._7H.setPieza(pieza);
						break;
					}

					PlacePieces(i, x, pieza);
				}
				
				tablero.add(celdas[i][x]);
			}
		}

		frame.setVisible(true);
	}

	public Pieces NewPiece(String color, Pieces.Types piece) throws IOException {
		Pieces pieza = new Pieces("src/graphics/assets/" + piece + "-" + color + ".png", color);
		return pieza;
	}
	
	public void PlacePieces(int i, int x, Pieces piece) throws IOException {
		Image asset = ImageIO.read(new File(piece.getPath())).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		JLabel colaider = new JLabel(new ImageIcon(asset), JLabel.CENTER) {
			private static final long serialVersionUID = 1L;

			@Override
			public int getWidth() {
				return 100;
			}
			
			@Override
			public int getHeight() {
				return 100;
			}
		};
		
		celdas[i][x].add(colaider);
	}
}
