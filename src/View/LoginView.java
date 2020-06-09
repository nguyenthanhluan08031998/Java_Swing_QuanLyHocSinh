package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ViewModel.LoginViewModel;

public class LoginView {

	public JFrame frame;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private static LoginView loginView;
	private static SignupView signupView;
	private static HomeView homeView;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginView = new LoginView();
					loginView.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public SignupView getJFrameLoginView() {
		return signupView;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(187, 26, 89, 30);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(66, 99, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(66, 145, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JButton btnSignup = new JButton("Sign up");
		btnSignup.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginView.frame.setVisible(false);
				signupView = new SignupView();
				//signupView.HiddenUnnecessaryFrame();
				signupView.setVisible(true);
			}
		});
		btnSignup.setBounds(87, 198, 89, 23);
		frame.getContentPane().add(btnSignup);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginViewModel loginViewModel = new LoginViewModel();
				if (loginViewModel.login(tfUsername.getText(), tfPassword.getText()) == true) {
					loginView.frame.setVisible(false);
					homeView = new HomeView();
					homeView.setVisible(true);
					System.out.print("succcess");
				}

				if (loginViewModel.login(tfUsername.getText(), tfPassword.getText()) == false) {
					System.out.print(" no succcess");
				}

			}
		});
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogin.setBounds(244, 198, 89, 23);
		frame.getContentPane().add(btnLogin);

		tfUsername = new JTextField();
		tfUsername.setBounds(162, 96, 149, 20);
		frame.getContentPane().add(tfUsername);
		tfUsername.setColumns(10);

		tfPassword = new JTextField();
		tfPassword.setBounds(162, 142, 149, 20);
		frame.getContentPane().add(tfPassword);
		tfPassword.setColumns(10);
	}
}
