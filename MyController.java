/** 
 * @author Christian Gabrail
 * @version version 2014-10-23
 * 
 */
package gabrail;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	}

	public void initial1(){
		
		
	}

	public void restart(){
		for(int i = 0; i < 16; i++){
			p.getButton(i).setEnabled(true);}
	}

	public void solve(){
		for(int i = 0; i < 16; i++){
			p.getButton(i).setEnabled(false);
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
