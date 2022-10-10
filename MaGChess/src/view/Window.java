/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import controller.Motor;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Window extends Motor {
	protected JFrame frame;
	protected static JPanel tablero;
	
	public Window(){
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension screenSize = t.getScreenSize();
		Dimension marginRL = new Dimension(((screenSize.width / 2) - 68) / 2, 0);
		Dimension marginTB = new Dimension(0, screenSize.height / 32);
		Dimension tableDim = new Dimension(screenSize.width - marginRL.width, screenSize.height - marginTB.height);
		
		JPanel marginR = new JPanel() {
			   private static final long serialVersionUID = 1L;
				
			   @Override
			   public Dimension getPreferredSize(){
				   return new Dimension(marginRL);
			   }
		};
		
		JPanel marginL = new JPanel() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public Dimension getPreferredSize(){
				return new Dimension(marginRL);
			}
		};
		
		JPanel marginT = new JPanel() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public Dimension getPreferredSize(){
				return new Dimension(marginTB);
			}
		};
		
		JPanel marginB = new JPanel() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public Dimension getPreferredSize(){
				return new Dimension(marginTB);
			}
		};
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		tablero = new JPanel();
		tablero.setPreferredSize(tableDim);
		tablero.setMaximumSize(tableDim);
		tablero.setMinimumSize(tableDim);
		tablero.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablero.setLayout(new GridLayout(8, 8, 0, 0));
		
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		frame.getContentPane().add(marginT, BorderLayout.NORTH);
		
		frame.getContentPane().add(marginB, BorderLayout.SOUTH);
		
		frame.getContentPane().add(marginR, BorderLayout.WEST);
		
		frame.getContentPane().add(marginL, BorderLayout.EAST);
	}
}
