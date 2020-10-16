package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	int nameNum = 1;
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
JFrame frame = new JFrame();
JPanel pane= new JPanel();
JButton addNames = new JButton();
JButton viewNames = new JButton();
ArrayList<String> names = new ArrayList<String>();

public void run() {
	addNames.setText("Add a Name");
	viewNames.setText("View Names");
	pane.add(addNames);
	pane.add(viewNames);
	frame.add(pane);
	addNames.addActionListener(this);
	viewNames.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource() == addNames) {
		
		String newName = JOptionPane.showInputDialog("Who is going in the guest book?");
	
		names.add(newName); 
		nameNum++;
	}
	else if(arg0.getSource()== viewNames) {
		for (int i = 1; i < nameNum;) {
			System.out.println("Guest #"+ i +": "+names.get(i));
			i++;
		}
	}
}
}
