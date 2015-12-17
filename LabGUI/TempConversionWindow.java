import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.lang.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,200);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("Convert from Celsius to Fahrenheit!");
	b.addActionListener(this);
	b.setActionCommand("C");
	JButton b2 = new JButton("Convert from Fahrenheit to Celsius!");
	b2.addActionListener(this);
	b2.setActionCommand("F");

	t = new JTextField(1);
	j = new JLabel("Ready!");
	
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
	setVisible(true);
    }

    public static double CtoF(double t){
	return t * 1.8 + 32;
    }

    public static double FtoC(double t){
	return (t - 32) / 1.8;
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("C")){
	    String s = t.getText();
	    double num = Double.parseDouble(s);
	    j.setText("Answer: " + CtoF(num));
	}
	if(event.equals("F")){
	    String s = t.getText();
	    double num = Double.parseDouble(s);
	    j.setText("Answer: " + FtoC(num));
   
	}
 
 
    }
}
