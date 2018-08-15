package lk.inli.springboot.model;

public class Student {
	private String name;
	private String causeId;
	private Integer age;

	public Student(String name, String causeId, Integer age) {
		super();
		this.name = name;
		this.causeId = causeId;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCauseId() {
		return causeId;
	}

	public void setCauseId(String causeId) {
		this.causeId = causeId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
