package co.yedam.person;

/*
 * 이름, 키, 몸무게, 혈액형, 나이 
 */
public class Person {
	private String name;
	private double height;
	private double weight;
	private String blood;
	private int age;

	private Person[] family;

	public Person() {
		family = new Person[3];
	}

	public Person(String name, double height, double weight, String blood, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double Weight) {
		this.weight = weight;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getBlood() {
		return blood;
	}

	public int getAge() {
		return age;
	}

}
