/** 
 * @author Christian Gabrail
 * @version version 2014-10-23
 * 
 */
package gabrail;
import java.awt.Container;
import java.awt.Dimension;



import javax.swing.JFrame;


public class MyFrame extends JFrame{
	public MyFrame(MyPanel p){
		super("My simple game/ TestAufgabe");
		this.setSize(new Dimension(800,700));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(p);
		this.setResizable(true);
		this.setVisible(true);
	}
}
	
	
		
	

