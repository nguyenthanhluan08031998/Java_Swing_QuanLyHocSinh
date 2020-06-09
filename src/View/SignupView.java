package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import View.*;

public class SignupView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static LoginView loginView;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginView getLoginView() {
		return loginView;
	}
	public void HiddenUnnecessaryFrame() {
		if(loginView != null) {
			loginView.frame.setVisible(false);
		}
	}
	public SignupView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setBounds(116, 11, 202, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(52, 86, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(52, 125, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(86, 242, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginView = new LoginView();
				loginView.getJFrameLoginView().setVisible(false);
				loginView.frame.setVisible(true);				
			}
		});
		btnCancel.setBounds(241, 242, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_3 = new JLabel("Passwor again");
		lblNewLabel_3.setBounds(52, 168, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(177, 83, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 122, 131, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 165, 131, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
