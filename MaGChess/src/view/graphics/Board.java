package view.graphics;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import controller.Motor;
import controller.mapping.Casillas;
import view.Window;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Board extends Window implements BoardEstructure {
	public Board() throws IOException {		
		for (int i = 0;i<8;i++) {
			for (int x = 0;x<8;x++) {
				celdas[i][x].setLayout(new GridLayout(8, 8, 0, 0));
				
				if (i % 2 == 0) {
					if (x % 2 != 0) {
						celdas[i][x].setBackground(_gray);
					}
				} else {
					if (x % 2 == 0) {
						celdas[i][x].setBackground(_gray);	
					}
				}
				
				if (i == 0) {
					if (x == 0 || x == 7) {
						Pieces pieza = Motor.NewPiece("negro", Pieces.Types.torre);
						
						if (x == 0) {
							Casillas._1A.setCasilla(celdas[i][x]);
							Casillas._1A.setPieza(pieza);
						} else if (x == 7) {
							Casillas._1H.setCasilla(celdas[i][x]);
							Casillas._1H.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 1 || x == 6) {
						Pieces pieza = Motor.NewPiece("negro", Pieces.Types.caballo);
						
						if (x == 1) {
							Casillas._1B.setCasilla(celdas[i][x]);
							Casillas._1B.setPieza(pieza);
						} else if (x == 6) {
							Casillas._1G.setCasilla(celdas[i][x]);
							Casillas._1G.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 2 || x == 5) {
						Pieces pieza = Motor.NewPiece("negro", Pieces.Types.alfil);
						
						if (x == 2) {
							Casillas._1C.setCasilla(celdas[i][x]);
							Casillas._1C.setPieza(pieza);
						} else if (x == 5) {
							Casillas._1F.setCasilla(celdas[i][x]);
							Casillas._1F.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 3) {
						Pieces pieza = Motor.NewPiece("negro", Pieces.Types.reina);
						
						Casillas._1D.setCasilla(celdas[i][x]);
						Casillas._1D.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
					
					if (x == 4) {
						Pieces pieza = Motor.NewPiece("negro", Pieces.Types.rey);
						
						Casillas._1E.setCasilla(celdas[i][x]);
						Casillas._1E.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
				}
				
				if (i == 1) {
					Pieces pieza = Motor.NewPiece("negro", Pieces.Types.peon);
					
					switch (x) {
					case 0: 
						Casillas._2A.setCasilla(celdas[i][x]);
						Casillas._2A.setPieza(pieza);
						break;
					case 1: 
						Casillas._2B.setCasilla(celdas[i][x]);
						Casillas._2B.setPieza(pieza);
						break;
					case 2: 
						Casillas._2C.setCasilla(celdas[i][x]);
						Casillas._2C.setPieza(pieza);
						break;
					case 3: 
						Casillas._2D.setCasilla(celdas[i][x]);
						Casillas._2D.setPieza(pieza);
						break;
					case 4: 
						Casillas._2E.setCasilla(celdas[i][x]);
						Casillas._2E.setPieza(pieza);
						break;
					case 5: 
						Casillas._2F.setCasilla(celdas[i][x]);
						Casillas._2F.setPieza(pieza);
						break;
					case 6: 
						Casillas._2G.setCasilla(celdas[i][x]);
						Casillas._2G.setPieza(pieza);
						break;
					case 7: 
						Casillas._2H.setCasilla(celdas[i][x]);
						Casillas._2H.setPieza(pieza);
						break;
					}

					PlacePieces(i, x, pieza);
				}
				
				if (i == 7) {
					if (x == 0 || x == 7) {
						Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.torre);
						
						if (x == 0) {
							Casillas._8A.setCasilla(celdas[i][x]);
							Casillas._8A.setPieza(pieza);
						} else if (x == 7) {
							Casillas._8H.setCasilla(celdas[i][x]);
							Casillas._8H.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 1 || x == 6) {
						Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.caballo);
						
						if (x == 1) {
							Casillas._8B.setCasilla(celdas[i][x]);
							Casillas._8B.setPieza(pieza);
						} else if (x == 6) {
							Casillas._8G.setCasilla(celdas[i][x]);
							Casillas._8G.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 2 || x == 5) {
						Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.alfil);
						
						if (x == 2) {
							Casillas._8C.setCasilla(celdas[i][x]);
							Casillas._8C.setPieza(pieza);
						} else if (x == 5) {
							Casillas._8F.setCasilla(celdas[i][x]);
							Casillas._8F.setPieza(pieza);
						}

						PlacePieces(i, x, pieza);
					}
					
					if (x == 3) {
						Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.reina);
						
						Casillas._8D.setCasilla(celdas[i][x]);
						Casillas._8D.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
					
					if (x == 4) {
						Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.rey);
						
						Casillas._8E.setCasilla(celdas[i][x]);
						Casillas._8E.setPieza(pieza);

						PlacePieces(i, x, pieza);
					}
				}
				
				if (i == 6) {
					Pieces pieza = Motor.NewPiece("blanco", Pieces.Types.peon);
					
					switch (x) {
					case 0: 
						Casillas._7A.setCasilla(celdas[i][x]);
						Casillas._7A.setPieza(pieza);
						break;
					case 1: 
						Casillas._7B.setCasilla(celdas[i][x]);
						Casillas._7B.setPieza(pieza);
						break;
					case 2: 
						Casillas._7C.setCasilla(celdas[i][x]);
						Casillas._7C.setPieza(pieza);
						break;
					case 3: 
						Casillas._7D.setCasilla(celdas[i][x]);
						Casillas._7D.setPieza(pieza);
						break;
					case 4: 
						Casillas._7E.setCasilla(celdas[i][x]);
						Casillas._7E.setPieza(pieza);
						break;
					case 5: 
						Casillas._7F.setCasilla(celdas[i][x]);
						Casillas._7F.setPieza(pieza);
						break;
					case 6: 
						Casillas._7G.setCasilla(celdas[i][x]);
						Casillas._7G.setPieza(pieza);
						break;
					case 7: 
						Casillas._7H.setCasilla(celdas[i][x]);
						Casillas._7H.setPieza(pieza);
						break;
					}

					PlacePieces(i, x, pieza);
				}
				
				tablero.add(celdas[i][x]);
			}
		}

		frame.setVisible(true);
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
