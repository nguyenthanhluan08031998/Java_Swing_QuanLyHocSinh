package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import ViewModel.*;

public class HomeView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfIDCard;
	private JTextField tfName;
	private JTextField tfBirthDay;
	private JTextField tfEmail;

	DefaultTableModel dataTable = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeView frame = new HomeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void loadStudentDB(JTable table) {
		HomeViewModel homeViewModel = new HomeViewModel();
		Vector columns = new Vector();
		columns.add("ID");
		columns.add("IDCard");
		columns.add("Name");
		columns.add("Birthday");
		columns.add("Email");
		// System.out.println("homeViewModel.getDatafromDB()" +
		// homeViewModel.getDatafromDB());
		dataTable.setDataVector(homeViewModel.getDatafromDB(), columns);
		table.setModel(dataTable);
	}

	public HomeView() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20, 20, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel AppBar = new JPanel();
		AppBar.setBounds(0, 0, 1184, 100);
		contentPane.add(AppBar);
		AppBar.setLayout(null);

		JPanel Main = new JPanel();
		Main.setBounds(0, 100, 1184, 561);
		contentPane.add(Main);
		Main.setLayout(null);

		JPanel panelStudentRecords = new JPanel();
		panelStudentRecords.setBounds(0, 0, 1184, 561);
		Main.add(panelStudentRecords);
		panelStudentRecords.setLayout(null);

		JLabel lblNewLabel = new JLabel("Student List");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(648, 23, 130, 38);
		panelStudentRecords.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("IDCard");
		lblNewLabel_1.setBounds(33, 165, 66, 14);
		panelStudentRecords.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(33, 219, 66, 14);
		panelStudentRecords.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Birth Day");
		lblNewLabel_3.setBounds(33, 273, 66, 14);
		panelStudentRecords.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(33, 326, 66, 14);
		panelStudentRecords.add(lblNewLabel_4);

		tfIDCard = new JTextField();
		tfIDCard.setBounds(132, 162, 189, 20);
		panelStudentRecords.add(tfIDCard);
		tfIDCard.setColumns(10);

		tfName = new JTextField();
		tfName.setBounds(132, 216, 189, 20);
		panelStudentRecords.add(tfName);
		tfName.setColumns(10);

		tfBirthDay = new JTextField();
		tfBirthDay.setBounds(132, 270, 189, 20);
		panelStudentRecords.add(tfBirthDay);
		tfBirthDay.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBounds(132, 320, 189, 20);
		panelStudentRecords.add(tfEmail);
		tfEmail.setColumns(10);

		JButton btnAddStudent = new JButton("New");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddStudent.setBounds(10, 35, 89, 23);
		panelStudentRecords.add(btnAddStudent);

		JButton btnDeleteStudent = new JButton("Delete");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = (int) table.getValueAt(table.getSelectedRow(), 0);
				System.out.print(id);
				HomeViewModel homeViewModel = new HomeViewModel();
				homeViewModel.deleteStudent(id);
				loadStudentDB(table);
			}
		});
		btnDeleteStudent.setBounds(132, 35, 89, 23);
		panelStudentRecords.add(btnDeleteStudent);

		JButton btnEditStudent = new JButton("Edit");
		btnEditStudent.setBounds(261, 35, 89, 23);
		panelStudentRecords.add(btnEditStudent);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 72, 733, 465);
		panelStudentRecords.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null }, },
				new String[] { "Number", "IDCard", "Name", "Birth Day", "Email" }));
		scrollPane.setViewportView(table);
		loadStudentDB(table);
		table.addMouseListener(new java.awt.event.MouseAdapter()

		{
			public void mouseClicked(java.awt.event.MouseEvent e){
				System.out.print("hello "+ table.getSelectedRow());
				tfIDCard.setText( (String) table.getValueAt(table.getSelectedRow(), 1));
				tfName.setText((String) table.getValueAt(table.getSelectedRow(), 2));
				tfBirthDay.setText((String) table.getValueAt(table.getSelectedRow(), 3));
				tfEmail.setText((String) table.getValueAt(table.getSelectedRow(), 4));
			}

		});

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeViewModel homeViewModel = new HomeViewModel();
				homeViewModel.addStudent(
						homeViewModel.getInfoStudent(new String(tfIDCard.getText().getBytes(Charset.forName("utf-8"))),
								new String(tfName.getText().getBytes(Charset.forName("utf-8"))),
								new String(tfBirthDay.getText().getBytes(Charset.forName("utf-8"))),
								new String(tfEmail.getText().getBytes(Charset.forName("utf-8")))));
				loadStudentDB(table);
			}
		});
		btnSave.setBounds(283, 105, 89, 23);
		panelStudentRecords.add(btnSave);

		JButton btnStudentRecords = new JButton("Student Records");
		btnStudentRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStudentRecords.setVisible(true);
			}
		});
		btnStudentRecords.setBounds(0, 0, 112, 86);
		AppBar.add(btnStudentRecords);

		JButton btnPointManagement = new JButton("Point Management");
		btnPointManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStudentRecords.setVisible(false);
			}
		});
		btnPointManagement.setBounds(162, 0, 124, 86);
		AppBar.add(btnPointManagement);

		JButton btnNewButton_2 = new JButton("Qu\u1EA3n l\u00FD l\u1EDBp");
		btnNewButton_2.setBounds(336, 0, 112, 86);
		AppBar.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("User");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(531, 0, 140, 86);
		AppBar.add(btnNewButton_3);

	}
}
