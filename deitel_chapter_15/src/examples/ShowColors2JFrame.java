// Example 15.2 - ShowColors2Frame.java
// Choosing colors with JColorChooser
package examples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame
{
	private JButton changeColorJButton; 
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	
	// set up GUI
	public ShowColors2JFrame()
	{
		// superclass constructor called to set title
		super( "Using JColorChooser" );
		
		// create JPanel for display color
		colorJPanel = new JPanel();
		colorJPanel.setBackground( color );
		
		// set up changeColorJButton and register its event handler 
		changeColorJButton = new JButton( "Change Color" );
		changeColorJButton.addActionListener(
			new ActionListener()		// anonymous inner class 
			{
				// display JColorChooser when user clicks button
				public void actionPerformed( ActionEvent event )
				{
					// launch a Color Chooser dialog centered in the parent window
					// String is title of the dialog, color is initial selected color
					color = JColorChooser.showDialog(
							ShowColors2JFrame.this, "Choose a color",  color );
					
					// set the default color if no color returned
					if ( color == null )
						color = Color.LIGHT_GRAY;
					
					// change the content pane's background to the new color
					colorJPanel.setBackground( color );
				}	// end method actionPerformed
			}	// end anonymous inner class ActionListener
		);	// end call to addActionListener
		
		add( colorJPanel, BorderLayout.CENTER );		// add colorJPanel
		add( changeColorJButton, BorderLayout.SOUTH );	// add button
		
		setSize( 400, 130 );		// set frame size
		setVisible( true );			// display frame
	}	// end constructor
}	// end class ShowColors2Frame