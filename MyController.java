/** 
 * @author Christian Gabrail
 * @version version 2014-10-23
 * 
 */
package gabrail;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyController implements ActionListener, IGame{
	private MyPanel p = new MyPanel(this);
	private MyFrame f = new MyFrame(p);
	public MyController(){
		initial1();
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Solve")){
			solve();
		}
		if(e.getActionCommand().equals("Restart")){
			restart();
		}
		else if(e.getActionCommand().equals("Exit")){
			f.dispose();
		}
		JButton xyz= new JButton();
		xyz=(JButton)e.getSource();
		System.out.println(xyz.getText());
		p.change(xyz.getText());
	}

	public void initial1(){
		
		
	}

	public void restart(){
		for(int i =1; i<26;i++){
			p.getButton(i).setBackground(Color.white);
		}
		for(int i = 1; i <(int)(Math.random()*26); i++){
			p.getButton((int)(Math.random()*26)).setBackground(Color.red);}
	}

	public void solve(){
		for(int i = 1; i < 26; i++){
			p.getButton(i).setBackground(Color.white);
		}
	}

	@Override
	public void initial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retstart() {
		// TODO Auto-generated method stub
		
	}

}
