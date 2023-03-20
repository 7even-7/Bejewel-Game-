
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PlayerLogin extends JFrame implements ActionListener{
	public JFrame UI;
	JTextField userInput;
	JButton login;
	String name;
	boolean closed = false;
	public PlayerLogin() {
		//create new UI, Panel, & set border style
		UI = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		BoxLayout boxl =  new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxl);
		
		//adding player login element
		JLabel text = new JLabel("Enter Your Player Name");
		login = new JButton("Login");
		userInput = new JTextField(4);
		
		panel.add(userInput);
		panel.add(text);
		login.addActionListener(this);
		panel.add(login);
		//set ui to visible
		UI.add(panel, BorderLayout.CENTER);
		UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UI.setTitle("Player Login");
		UI.pack();
		UI.setVisible(true);
		
		
	}
	public String getName() {
		return this.name;
	}
	public boolean getStatus() {
		return this.closed;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//get the player name from input field
		String input = userInput.getText();
		name = input;
//		this.closed = true;
		//System.out.print(name);
		//System.out.println(closed);
		//System.exit(0);
		UI.setVisible(false);
//		System.out.println(name);
//		BejewlGame game = new BejewlGame();
		selectGame choose =  new selectGame(name);

		
	}
}
