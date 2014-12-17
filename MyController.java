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
//Der Controller enthält auch ein par Logikfunktionen 
public class MyController implements ActionListener, IGame{		//ActionListener wird implementiert
	private MyPanel p = new MyPanel(this);
	private MyFrame f = new MyFrame(p);
	public MyController(){
		initial1();
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Solve")){			//Wenn man auf den Button "solve" klickt, dann wird die Methode "solve" ausgeführt.
			solve();
		}
		if(e.getActionCommand().equals("Restart")){			//Wenn man auf den Button "restart" klickt, dann wird die Methode "restart" ausgeführt.
			restart();
		}
		else if(e.getActionCommand().equals("Exit")){		//Wenn man auf den Button "exit" klickt, dann wird das Programm geschlossen.
			f.dispose();
		}
		JButton xyz= new JButton();						
		xyz=(JButton)e.getSource();							
		System.out.println(xyz.getText());
		p.change(xyz.getText());
	}

	public void initial1(){
		
		
	}

	public void restart(){									//hier werden die Methoden "restart" und "solve" erstellt. Die Farben werden hier eingestellt.
		for(int i =1; i<26;i++){							//Die Anfangsfarbe wird eingestellt. Wenn man auf "restart" klickt, wird eine zufällig große Anzahl von Buttons rot gefärbt. 
			p.getButton(i).setBackground(Color.white);		
		}
		for(int i = 1; i <(int)(Math.random()*26); i++){
			p.getButton((int)(Math.random()*26)).setBackground(Color.red);}
	}

	public void solve(){								//hier wird die Farbe eingestellt, die die Buttons beim anklicken von solve haben.
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
