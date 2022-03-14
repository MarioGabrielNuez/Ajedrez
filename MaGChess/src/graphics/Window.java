/**
 * 
 */
package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Window {
	protected JFrame frame;
	protected static JPanel tablero;
	
	public Window() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		tablero = new JPanel();
		tablero.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablero.setLayout(new GridLayout(8, 8, 0, 0));
		
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		JPanel piezasComidas = new JPanel();
		frame.getContentPane().add(piezasComidas, BorderLayout.NORTH);
		
		JPanel command = new JPanel();
		frame.getContentPane().add(command, BorderLayout.SOUTH);
		
		JPanel piezasMuert = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public Dimension getPreferredSize(){
				return new Dimension(300, 0);
			}
		};
		
		frame.getContentPane().add(piezasMuert, BorderLayout.WEST);
		
		JPanel Contrario = new JPanel(){
			private static final long serialVersionUID = 1L;

			@Override
			public Dimension getPreferredSize(){
				return new Dimension(300, 0);
			}
		};
		
		frame.getContentPane().add(Contrario, BorderLayout.EAST);
	}
}
