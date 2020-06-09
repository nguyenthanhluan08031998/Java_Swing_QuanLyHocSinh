package Model;

public class User {
	private int id;
	private String Username;
	private String Password;

	public User() {
	}

	public User(int id, String Username, String Password) {
		super();
		this.id = id;
		this.Username = Username;
		this.Password = Password;
	}
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
    	return Username;
    }
    public void setUsername(String Username) {
    	this.Username = Username;
    }
    public String getPassword() {
    	return Password;
    }
    public void setPasssword(String Password) {
    	this.Password = Password;
    }
}
