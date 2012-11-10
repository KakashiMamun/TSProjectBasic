/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherstudentproject;

/**
 *
 * @author Mamun
 */
import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 10 11:06:01 BDT 2012
 */



/**
 * @author Mamun
 */
public class LoginSelectPanel extends JPanel  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		teacherSelect = new JButton();
		StudentSelect = new JButton();

		//======== LoginSelectPanel ========
		{
			this.setLayout(null);

			//---- teacherSelect ----
			teacherSelect.setText("Teacher");
			this.add(teacherSelect);
			teacherSelect.setBounds(130, 95, 175, 65);

			//---- StudentSelect ----
			StudentSelect.setText("Student");
			this.add(StudentSelect);
			StudentSelect.setBounds(130, 195, 175, 65);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < this.getComponentCount(); i++) {
					Rectangle bounds = this.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = this.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				this.setMinimumSize(preferredSize);
				this.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	
	private JButton teacherSelect;
	private JButton StudentSelect;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
