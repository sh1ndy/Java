package ch13;

public class UserInfo {

	private String name;
	private String id;
	private String password;

	UserInfo() {

	}

	UserInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}