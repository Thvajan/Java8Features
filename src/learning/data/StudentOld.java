package learning.data;

import java.util.List;

public class StudentOld {

	String name;
	String gender;
	int age;
	List<String> hobbies;

	public StudentOld(String name, String gender, int age, List<String> hobbies) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobbies = hobbies;
	}

	public StudentOld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "StudentOld [name=" + name + ", gender=" + gender + ", age=" + age + ", hobbies=" + hobbies + "]";
	}

	public StudentOld clone() {
		return new StudentOld(name, gender, age, hobbies);
	}
}
