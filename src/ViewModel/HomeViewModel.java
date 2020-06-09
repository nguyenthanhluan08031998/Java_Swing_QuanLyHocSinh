package ViewModel;

import java.sql.ResultSet;
import java.util.Vector;

import JDBCConnectMySQL.JDBCConnectMySQL;
import Model.Student;
import View.*;

public class HomeViewModel {
	public Vector getDatafromDB() {
		Vector dataStudent = new Vector();
		try {
			JDBCConnectMySQL jdbcConnectMySQL = new JDBCConnectMySQL();
			ResultSet rs = jdbcConnectMySQL.get("select * from Student;");
			while (rs.next()) {
				Vector student = new Vector();
				student.add(rs.getInt(1));
				student.add(rs.getString(2));
				student.add(rs.getString(3));
				student.add(rs.getString(4));
				student.add(rs.getString(5));
				dataStudent.add(student);
			}
			return dataStudent;
		} catch (Exception ex) {
			// println ex
		}
		return dataStudent;
	}
	public Student getInfoStudent( String IDCard, String Name, String BirthDay, String Email) {
		Student student = new Student(0,IDCard, Name, BirthDay, Email);
		return  student;
	}
	public void addStudent(Student student) {
		try {
			String query = "INSERT INTO `Student` (`IdCard`, `Name`, `Birthday`, `Email`) VALUES ("
		+ "'"+ student.getIdCard()+"','" +student.getName()+ "','" +student.getBirthday()+"','"+student.getEmail()+ "');";
			JDBCConnectMySQL jdbcConnectMySQL = new JDBCConnectMySQL();
			jdbcConnectMySQL.add(query);
		}
		catch(Exception ex) {
			
		}
	}
	public void deleteStudent(int id) {
		try {
			String query = "DELETE FROM `datastudent`.`Student` WHERE (`Id` = '"+id +"');";
						JDBCConnectMySQL jdbcConnectMySQL = new JDBCConnectMySQL();
						jdbcConnectMySQL.delete(query);
		}catch(Exception ex) {
			
		}
	}

}
