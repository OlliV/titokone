package fi.hu.cs.titokone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class GUICompileSettingsDialog extends JDialog {
  
private JButton applyButton, closeButton;
public JCheckBox lineByLineCheckBox;
public JCheckBox showCommentsCheckBox;
	  
public static String APPLY = "GUICompileSettingsDialog_Apply";


public GUICompileSettingsDialog(Frame ownerFrame, boolean modal) {
	
	super(ownerFrame, modal);
	setTitle("Set compiling options");
	setSize(250,180);
	
	applyButton = new JButton("Apply");
	closeButton = new JButton("Close");
	
	applyButton.setActionCommand(APPLY);
	applyButton.addActionListener((GUI)ownerFrame);
	closeButton.addActionListener( new ActionListener() {
		public void actionPerformed( ActionEvent e ) {
			setVisible(false);
		} 
	} );
	
	
	lineByLineCheckBox = new JCheckBox("Compile line by line");
	showCommentsCheckBox = new JCheckBox("Show comments");
	
	getContentPane().setLayout( new BorderLayout() );
	
	JPanel checkBoxPanel = new JPanel(new GridLayout(2,1));
	
	checkBoxPanel.add(lineByLineCheckBox);
	checkBoxPanel.add(showCommentsCheckBox);
	
	JPanel buttonPanel = new JPanel(new FlowLayout());
	buttonPanel.add(applyButton);
	buttonPanel.add(closeButton);
	
	getContentPane().add(checkBoxPanel, BorderLayout.CENTER);
	getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	
	pack();
	
	setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	
}

}