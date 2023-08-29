package spring_jdbc.entity;


public class User {
	private int id;
	private String  Name;
	private String MobileNumber;
	private String Subject;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String mobileNumber, String subject) {
		super();
		Name = name;
		MobileNumber = mobileNumber;
		Subject = subject;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", MobileNumber=" + MobileNumber + ", Subject=" + Subject + "]";
	}
	
	
}
