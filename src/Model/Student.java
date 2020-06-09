package Model;

public class Student {

	private int id;
	private String idCard;
	private String name;
	private String birthday;
	private String email;

	public Student() {
	}

	public Student(int id, String idCard, String name, String birthday, String email) {
		super();
		this.id = id;
		this.idCard = idCard;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
