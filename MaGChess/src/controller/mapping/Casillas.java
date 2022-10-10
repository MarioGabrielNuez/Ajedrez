package controller.mapping;

import javax.swing.JPanel;

import view.graphics.Pieces;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public enum Casillas{
	_1A(new JPanel(), null), _1B(new JPanel(), null), _1C(new JPanel(), null), _1D(new JPanel(), null), _1E(new JPanel(), null), _1F(new JPanel(), null), _1G(new JPanel(), null), _1H(new JPanel(), null),
	_2A(new JPanel(), null), _2B(new JPanel(), null), _2C(new JPanel(), null), _2D(new JPanel(), null), _2E(new JPanel(), null), _2F(new JPanel(), null), _2G(new JPanel(), null), _2H(new JPanel(), null),
	_3A(new JPanel(), null), _3B(new JPanel(), null), _3C(new JPanel(), null), _3D(new JPanel(), null), _3E(new JPanel(), null), _3F(new JPanel(), null), _3G(new JPanel(), null), _3H(new JPanel(), null),
	_4A(new JPanel(), null), _4B(new JPanel(), null), _4C(new JPanel(), null), _4D(new JPanel(), null), _4E(new JPanel(), null), _4F(new JPanel(), null), _4G(new JPanel(), null), _4H(new JPanel(), null),
	_5A(new JPanel(), null), _5B(new JPanel(), null), _5C(new JPanel(), null), _5D(new JPanel(), null), _5E(new JPanel(), null), _5F(new JPanel(), null), _5G(new JPanel(), null), _5H(new JPanel(), null),
	_6A(new JPanel(), null), _6B(new JPanel(), null), _6C(new JPanel(), null), _6D(new JPanel(), null), _6E(new JPanel(), null), _6F(new JPanel(), null), _6G(new JPanel(), null), _6H(new JPanel(), null),
	_7A(new JPanel(), null), _7B(new JPanel(), null), _7C(new JPanel(), null), _7D(new JPanel(), null), _7E(new JPanel(), null), _7F(new JPanel(), null), _7G(new JPanel(), null), _7H(new JPanel(), null),
	_8A(new JPanel(), null), _8B(new JPanel(), null), _8C(new JPanel(), null), _8D(new JPanel(), null), _8E(new JPanel(), null), _8F(new JPanel(), null), _8G(new JPanel(), null), _8H(new JPanel(), null);

	private JPanel casilla;
	private Pieces pieza;
	
	Casillas (JPanel casilla, Pieces pieza){
		this.casilla = casilla;
	}
	
	public JPanel getCasilla() {return casilla;}
	public Pieces getPieza() {return pieza;}
	
	public void setCasilla(JPanel casilla) {
		this.casilla = casilla;
	}

	public void setPieza(Pieces pieza) {
		this.pieza = pieza;
	}
}
