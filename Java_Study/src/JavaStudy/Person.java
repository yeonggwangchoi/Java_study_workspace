package JavaStudy;

public class Person {
	
	int age;
	String name,address;
	boolean sex;
	
	public void printAge() {
		System.out.println("나이 : "+age);
	}
	public void printName() {
		System.out.println("이름 : "+name);
	}
	public void printAddress() {
		System.out.println("주소 : "+address);
	}
	public void printSex() {
		if(sex==true)
			System.out.println("성별 : 남자");
		else
			System.out.println("성별 : 여자");
	}
}
