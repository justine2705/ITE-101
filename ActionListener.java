java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionListener immplements ActionListener {
	public void actionPerfomed(ActionEvent e) {
		JOptionPane.showMessageDialog(MenuExample.frame, 
			"Got an ActionEvent at " + new Date(e.getWhen())
			  + " from " + e.getSource().getClass());
	}
}
