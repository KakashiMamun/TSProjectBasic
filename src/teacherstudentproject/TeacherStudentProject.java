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
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 10 10:57:17 BDT 2012
 */



/**
 * @author Mamun
 */
public class TeacherStudentProject extends JFrame {
	public TeacherStudentProject() {
		initComponents();
	}

        private void teacherSelectMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            isteacher = true;
            LoginSelectPanel.setVisible(false);
            LoginPanel.setVisible(true);
            QuesNumberSelectPanel.setVisible(false);
	}

	private void StudentSelectMouseClicked(MouseEvent e) {
		// TODO add your code here
             isteacher = false;
            LoginSelectPanel.setVisible(false);
            LoginPanel.setVisible(true);
            QuesNumberSelectPanel.setVisible(false);
	}

	private void submitButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            if(isteacher == true)
            {
                LoginPanel.setVisible(false);
                LoginSelectPanel.setVisible(false);
                QuesNumberSelectPanel.setVisible(true);
            }
          
	}

        private void backButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            LoginSelectPanel.setVisible(true);
            LoginPanel.setVisible(false);
            QuesNumberSelectPanel.setVisible(false);
	}

        private void proccedButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		LoginSelectPanel = new JPanel();
		teacherSelect = new JButton();
		StudentSelect = new JButton();
                
		LoginPanel = new JPanel();
		submitButton = new JButton();
		usernameField = new JTextField();
		passField = new JPasswordField();
		usernameLabel = new JLabel();
		passLabel = new JLabel();
		backButton = new JButton();

                QuesNumberSelectPanel = new JPanel();
		MCQField = new JTextField();
		MCQLabel = new JLabel();
		TFField = new JTextField();
		proccedButton = new JButton();
		TFLabel = new JLabel();




		//======== this ========
		setResizable(false);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== LoginSelectPanel ========
		{
			LoginSelectPanel.setLayout(null);

			//---- teacherSelect ----
			teacherSelect.setText("Teacher");
			LoginSelectPanel.add(teacherSelect);
			teacherSelect.setBounds(130, 95, 175, 65);
                        teacherSelect.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					teacherSelectMouseClicked(e);
				}
			});
			LoginSelectPanel.add(teacherSelect);
			teacherSelect.setBounds(130, 95, 175, 65);

			//---- StudentSelect ----
			StudentSelect.setText("Student");
			StudentSelect.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					StudentSelectMouseClicked(e);
				}
			});

			//---- StudentSelect ----
			StudentSelect.setText("Student");
			LoginSelectPanel.add(StudentSelect);
			StudentSelect.setBounds(130, 195, 175, 65);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < LoginSelectPanel.getComponentCount(); i++) {
					Rectangle bounds = LoginSelectPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = LoginSelectPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				LoginSelectPanel.setMinimumSize(preferredSize);
				LoginSelectPanel.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(LoginSelectPanel);
		LoginSelectPanel.setBounds(60, 75, 435, 325);
                LoginSelectPanel.setVisible(true);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		setSize(580, 500);
		setLocationRelativeTo(getOwner());

		//======== LoginPanel ========
		{
			LoginPanel.setLayout(null);

			//---- submitButton ----
			submitButton.setText("Submit");
			submitButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					submitButtonMouseClicked(e);
				}
			});
			LoginPanel.add(submitButton);
			submitButton.setBounds(130, 200, 175, 35);
			LoginPanel.add(usernameField);
			usernameField.setBounds(130, 120, 175, usernameField.getPreferredSize().height);
			LoginPanel.add(passField);
			passField.setBounds(130, 160, 175, passField.getPreferredSize().height);

			//---- usernameLabel ----
			usernameLabel.setText("Username:");
			LoginPanel.add(usernameLabel);
			usernameLabel.setBounds(20, 120, 80, 20);

			//---- passLabel ----
			passLabel.setText("Password:");
			LoginPanel.add(passLabel);
			passLabel.setBounds(20, 160, 80, 20);



			//---- backButton ----
			backButton.setText("Back");
			backButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					submitButtonMouseClicked(e);
					backButtonMouseClicked(e);
				}
			});
			LoginPanel.add(backButton);
			backButton.setBounds(10, 275, 75, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < LoginPanel.getComponentCount(); i++) {
					Rectangle bounds = LoginPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = LoginPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				LoginPanel.setMinimumSize(preferredSize);
				LoginPanel.setPreferredSize(preferredSize);
			}
		}
                
                contentPane.add(LoginPanel);
		LoginPanel.setBounds(60, 75, 435, 325);
                LoginPanel.setVisible(false);

                
                //======== QuesNumberSelectPanel ========
		{
			QuesNumberSelectPanel.setLayout(null);
			QuesNumberSelectPanel.add(MCQField);
			MCQField.setBounds(325, 75, 60, MCQField.getPreferredSize().height);

			//---- MCQLabel ----
			MCQLabel.setText("Number of MCQs");
			QuesNumberSelectPanel.add(MCQLabel);
			MCQLabel.setBounds(35, 70, 115, 20);
			QuesNumberSelectPanel.add(TFField);
			TFField.setBounds(325, 120, 60, 20);

			//---- proccedButton ----
			proccedButton.setText("Procced");
			proccedButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					proccedButtonMouseClicked(e);
				}
			});
			QuesNumberSelectPanel.add(proccedButton);
			proccedButton.setBounds(155, 195, 130, 35);

			//---- TFLabel ----
			TFLabel.setText("Number of True/False Questions");
			QuesNumberSelectPanel.add(TFLabel);
			TFLabel.setBounds(35, 120, 240, 20);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < QuesNumberSelectPanel.getComponentCount(); i++) {
					Rectangle bounds = QuesNumberSelectPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = QuesNumberSelectPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				QuesNumberSelectPanel.setMinimumSize(preferredSize);
				QuesNumberSelectPanel.setPreferredSize(preferredSize);
			}
		}
                
                contentPane.add(QuesNumberSelectPanel);
		QuesNumberSelectPanel.setBounds(60, 75, 435, 325);
                QuesNumberSelectPanel.setVisible(false);


                
                LoginPanel.setVisible(false);
                LoginSelectPanel.setVisible(true);
                QuesNumberSelectPanel.setVisible(false);
            
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel LoginSelectPanel;
	private JButton teacherSelect;
	private JButton StudentSelect;
        
	private JPanel LoginPanel;
	private JButton submitButton;
	private JTextField usernameField;
	private JPasswordField passField;
	private JLabel usernameLabel;
	private JLabel passLabel;
	private JButton backButton;

        private JPanel QuesNumberSelectPanel;
	private JTextField MCQField;
	private JLabel MCQLabel;
	private JTextField TFField;
	private JButton proccedButton;
	private JLabel TFLabel;

        
        private boolean isteacher;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

        
        public static void main(String[] args)
        {
            TeacherStudentProject mainFrame = new TeacherStudentProject();

            mainFrame.setVisible(true);
            
        }
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
