
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Adding {
	public static void main(String[] args) {
		//Making the Frame
		JFrame frame = new JFrame("Adding Machine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);

		//Make box labels
		JLabel lab1 = new JLabel("First Number");
		lab1.setLayout(null);
		JLabel lab2 = new JLabel("Second Number");
		lab2.setLayout(null);
		JLabel lab3 = new JLabel("Result");
		lab3.setLayout(null);
		
		
		//Make boxes
		JTextField tf1 = new JTextField(10);
		tf1.setLayout(null);
		JTextField tf2 = new JTextField(10);
		tf2.setLayout(null);
		JTextArea ta = new JTextArea();
		ta.setLayout(null);
		//Make Buttons
		JButton add = new JButton("Add");
		add.setLayout(null);
		
		//Add everything to frame
		frame.add(lab1);
		frame.add(lab2);
		frame.add(lab3);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(ta);
		frame.add(add);
		
		//Set Positions of components on frame
		lab1.setBounds(35, 20, 100, 10);
		tf1.setBounds(150, 15, 100, 20);
		
		lab2.setBounds(35,60,100,10);
		tf2.setBounds(150, 55, 100, 20);
		
		lab3.setBounds(70,100,100,10);
		ta.setBounds(150, 95, 100, 20);
		
		add.setBounds(100, 185, 80, 40);
		
		//Adding functionality
		
		
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String x = tf1.getText();
				String y = tf2.getText();
				
				int resx = Integer.parseInt(x);
				int resy = Integer.parseInt(y);
				int s = resx + resy;
				
				ta.setText("" + s);
			}
		});
				
		
		
	}
}
