import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{
	
	
	
	public FirstWindow() {
		super("My computer is VERY special!");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
				
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout() );
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.CYAN);
		
		
		JButton b1 = new JButton("button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("button 2");
		b2.setBackground(Color.YELLOW);
		
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		JButton b5 = new JButton("button 5");
		JButton b6 = new JButton("button 6");
		JButton b7 = new JButton("button 7");
		JButton b8 = new JButton("button 8");
		
		JCheckBox cb1 = new JCheckBox("Do you LOVE bacon?");
		cb1.setBackground(Color.CYAN);
		
		JCheckBox cb2 = new JCheckBox("Do you LOVE Java?");
		Color myNewColor = new Color (150, 100, 250, 100);  //creates your new color
		cb2.setBackground(myNewColor);
			
		JCheckBox cb3 = new JCheckBox("This is a checkbox.");
		
		JLabel myLabel = new JLabel("Fancy label!");
		JTextArea myTextArea = new JTextArea("Fancy TextArea!");
		JTextField myTextField = new JTextField("Fancy TextField!");
		JRadioButton rb1 = new JRadioButton("Pie");
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		// Checkpoint Grade!
		//East Panel 1 x 3 (vertical 3 on top of each other)
		//Center Panel 3 x 3
		//West Panel 2 x 3 (2 across, 3 deep)
		
		
		p1.add(b1);
		p1.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		p4.add(rb1);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		// 3 x 3 panel 3 (center)
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(b3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(b4, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(b5, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(b6, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(b7, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(b8, gbc);
		p5.add(cb3);
		
		
		add(p1, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		add(p4, BorderLayout.WEST);
		add(p5, BorderLayout.EAST);
		
		
		setVisible(true);
	} // end of constructor
	
	
	
	
	
	

	
	
} // end of class FirstWindow


