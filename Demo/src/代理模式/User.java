package 代理模式;

public class User {

	private String name;
	private String age;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
