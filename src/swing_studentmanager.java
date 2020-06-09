//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;
//
//import java.awt.Font;
//import javax.swing.SwingConstants;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Vector;
//import java.awt.event.ActionEvent;
//import Model.*;
//import View.*;
//public class swing_studentmanager extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField tfID;
//	private JTextField tfName;
//	private JTextField tfBirthday;
//	private JTable table;
//
//	int stt = 0;
//	Vector columns = new Vector();
//	Vector data = new Vector();
//	Vector row ;
//	DefaultTableModel dataTable = new DefaultTableModel();
//	/**
//	 * Launch the application.
//	 */
//	/*public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					swing_studentmanager frame = new swing_studentmanager();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}*/
//	public void setStudent(Student st) {
//		stt++;
//		row = new Vector();
//		row.add(stt);
//		row.add(st.getId());
//		row.add(st.getName());
//		row.add(st.getBirthday());
//		data.add(row);
//	}
//	public void constructorColumns() {
//		columns.add("ID");
//		columns.add("Name");
//		columns.add("Birthday");
//	}
//	/**
//	 * Create the frame.
//	 */
//	public swing_studentmanager() {
//		constructorColumns();
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 579, 446);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("ID");
//		lblNewLabel.setBounds(133, 64, 48, 14);
//		contentPane.add(lblNewLabel);
//		
//		tfID = new JTextField();
//		tfID.setBounds(211, 61, 149, 20);
//		contentPane.add(tfID);
//		tfID.setColumns(10);
//		
//		tfName = new JTextField();
//		tfName.setBounds(211, 110, 149, 20);
//		contentPane.add(tfName);
//		tfName.setColumns(10);
//		
//		tfBirthday = new JTextField();
//		tfBirthday.setBounds(211, 158, 149, 20);
//		contentPane.add(tfBirthday);
//		tfBirthday.setColumns(10);
//		
//		JLabel lblNewLabel_1 = new JLabel("Name");
//		lblNewLabel_1.setBounds(133, 113, 48, 14);
//		contentPane.add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("Birthday");
//		lblNewLabel_2.setBounds(133, 161, 48, 14);
//		contentPane.add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("Manager Student");
//		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
//		lblNewLabel_3.setBounds(216, 11, 183, 28);
//		contentPane.add(lblNewLabel_3);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(49, 246, 483, 150);
//		contentPane.add(scrollPane);
//		
//		table = new JTable();
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null},
//			},
//			new String[] {
//				"STT","ID", "Name", "Birthday"
//			}
//		));
//		scrollPane.setViewportView(table);
//		
//		JButton btnAdd = new JButton("Add");
//		btnAdd.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {	
//				Student st = null;
//				String ID = tfID.getText();
//				String Name = tfName.getText();
//				String Birthday = tfBirthday.getText();
//				st = new Student(ID, Name, Birthday);
//				setStudent(st);		
//				dataTable.setDataVector(data, columns);
//
//				table.setModel(dataTable);
//			}
//		});
//		btnAdd.setBounds(90, 212, 89, 23);
//		contentPane.add(btnAdd);
//		
//		JButton btnDelete = new JButton("Delete");
//		btnDelete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//System.out.println(table.getValueAt(table.getSelectedRow()));
//				System.out.print(table.getModel());
//			}
//		});
//		btnDelete.setBounds(231, 212, 89, 23);
//		contentPane.add(btnDelete);
//		
//		JButton btnEdit = new JButton("Edit");
//		btnEdit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		btnEdit.setBounds(372, 212, 89, 23);
//		contentPane.add(btnEdit);
//	}
//}
