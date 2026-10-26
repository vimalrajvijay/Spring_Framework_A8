package test.copy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private int id;
	
	private String name;
	
	private int age;

	public Student() {
		
	}
	
	public Student( int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	@Value("101")
	public void setId( int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("abc")
	public void setName( String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Value("21")
	public void setAge( int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
