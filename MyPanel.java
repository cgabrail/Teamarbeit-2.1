/** 
 * @author Christian Gabrail
 * @version version 2014-10-23
 * 
 */
package gabrail;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;


public class MyPanel extends JPanel{
	private JLabel l2;
	private MyController c;
	private JPanel p1, p2, p3;
	private JButton[] b = new JButton[16];
	private JButton[] b2 = new JButton[3];
	private JLabel[] l= new JLabel[5];
	
	public MyPanel(MyController c){
		this.c =new MyController();
		this.setLayout(new BorderLayout());
		pinit();
		linit();
		binit(c);
	}
	
	public void PaintComponent(Graphics g){
	}
	private void pinit(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p2.setLayout(new GridLayout(4,4));
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		this.add(p2, BorderLayout.CENTER);
		this.add(p1, BorderLayout.WEST);
		this.add(p3, BorderLayout.SOUTH);
	}
	private void linit(){
		for(int i = 0; i < 5; i++)	{
			//l[i] = new JLabel("my simple game");
			l[i].setPreferredSize(new Dimension(50, 80));
			p1.add(l[i]);
		}
		l2 = new JLabel("Find the correct sequence: Start with 0!");
		this.add(l2, BorderLayout.NORTH);
	}
	private void binit(MyController c){
		for(int i = 0; i < 16; i++)	{
			b[i] = new JButton(""+i);
			//b[i].addActionListener(this.c);
			p2.add(b[i]);
		}
		b2[0] = new JButton("Solve");
		b2[0].addActionListener(c);
		b2[1] = new JButton("Restart");
		b2[1].addActionListener(c);
		b2[2] = new JButton("Exit");
		b2[2].addActionListener(c);
		for(int i = 0; i < b2.length; i++)	{
			p3.add(b2[i]);
		}
	}
	public void setlabel(int i, String text){
		l[i].setText(text);
	}
	public JButton getButton(int i){
		return b[i];
	}
}

