// Example 14.15a - FlowLayoutFrame.java
// Demonstrating FlowLayout alignments
package examples_1;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
	private JButton leftJButton;		// button to set alignment left
	private JButton rightJButton;		// button to set alignment right
	private JButton centerJButton;		// button to set alignment center
	private FlowLayout layout;			// layout object
	private Container container;		// container to set layout
	
	// set up GUI and register button listeners
	public FlowLayoutFrame()
	{
		super( "FlowLayout Demo" );
		
		layout = new FlowLayout();		// create FlowLayout
		container = getContentPane();	// get container to layout
		setLayout( layout );			// set frame layout to flow layout
		
		// set up leftJButton and register listener
		leftJButton = new JButton( "Left ");	// create button
		add( leftJButton );						// add button to panel
		
		// add event listener with an anonymous class for left button
		leftJButton.addActionListener(
			new ActionListener()		// anonymous inner class
			{
				// process leftJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.LEFT );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method actionPerformed
			}	// end anonymous inner class 
		);	// end call to addActionListen
		
		
		// set up rightJButton and register listener
		rightJButton = new JButton( "Right" );
		add( rightJButton );
		
		// add event listener with an anonymous class for right button
		rightJButton.addActionListener(
			new ActionListener()
			{
				// process rightJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.RIGHT );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method ActionPerformed
			}	// end anonymous inner class
		);	// end call to addActionListener
		
		
		// set up centerJButton and register listener
		centerJButton = new JButton( "Center" );
		add( centerJButton );
		
		// add event listener with an anonymous class for center button
		centerJButton.addActionListener(
			new ActionListener()
			{
				// process centerJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.CENTER );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method actionPerformed
			}	// end anonymous inner class
		);	// end call to addActionListener
	}	// end constructor
}	// end class FlowLayoutFrame