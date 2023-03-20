import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class selectGame extends JFrame implements ActionListener{

	private JTextField userInput;
	private String playerName;
	public  selectGame(String name) {
		this.playerName = name;
		JFrame f = new JFrame();
		this.setSize(200, 200);
		
		//create the Jpanel 
		JPanel playerPanel = new JPanel();
		playerPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		BoxLayout boxl =  new BoxLayout(playerPanel, BoxLayout.Y_AXIS);
		//set box layout
		playerPanel.setLayout(boxl);
		
		//create input listener
		JButton login = new JButton("Login");
		userInput = new JTextField(4);
		login.addActionListener(this);
		//create game contents
		JLabel games = new JLabel("<html>Select from the following games:<br>1. Enter T to play Tetris<br>2. Enter B to play Bejewel<br></html>");
		//add components to Jpanel
		playerPanel.add(games);
		playerPanel.add(userInput);
		playerPanel.add(login);
		
		this.getContentPane().add(playerPanel, "Center");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Select Game");
		this.pack();
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//get user name
		String input = userInput.getText();
	
	
		System.out.print(playerName);
		//System.out.println(closed);
		//System.exit(0);
		
		//System.out.println(name);
		if (input.equals("B")) {
			BejewlGame game = new BejewlGame(this.playerName);
			this.setVisible(false);
		}
		
		if (input.equals("T")) {
			this.setVisible(false);
		}
		
		
		
	}
	
}
