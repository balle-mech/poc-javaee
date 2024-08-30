package beans;

public class Emp {
	private int id;
	private String name;
	private String email;

	// 引数なしのデフォルトコンストラクタ
	public Emp() {
	}

	// 引数付きコンストラクタ
	public Emp(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
