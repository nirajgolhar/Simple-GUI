import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordlabel ;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel failed;	
	
	public static void main(String[] args) {
		// container for your application i.e JFrame.
		JFrame frame=new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//Panel within Window(JFrame)
		JPanel panel=new JPanel(); 
		frame.add(panel);
		
		panel.setLayout(null);
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordlabel = new JLabel("Password");
		passwordlabel.setBounds(10, 50 , 80, 25);
		panel.add(passwordlabel);
		
		passwordText= new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10,80,80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
	
		failed = new JLabel("");
		failed.setBounds(10,110,300,25);
		panel.add(failed);

		
		
		
		frame.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//System.out.println("Button Clicked");
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user+","+password);
		if(user.equals("Niraj") && password.equals("NIraj123")) {
			success.setText("login succesful!");
		}
		else
		{
			failed.setText("login Failed");
			
		}
	}

}
