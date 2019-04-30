package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaTeste extends JFrame implements Observer{
	JLabel label;
	
	public TelaTeste() {
		setSize(140,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);		
		setLayout(new FlowLayout());
		
		label = new JLabel("0");
		label.setFont(new Font("Verdana",Font.ITALIC + Font.BOLD , 20));
		label.setForeground(Color.red);
		
		add(label);
		setVisible(true);
	}

	/**
	 * @return the label
	 */
	public JLabel getLabel() {
		return label;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		//if(o instanceof) 
		label.setText(arg1+"");
		
	}
}
