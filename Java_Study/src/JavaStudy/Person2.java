package JavaStudy;

public class Person2 {
	
	int age;
	String name, address;
	boolean sex;
	
	public void printname(String paramname) {
		name = paramname;
		System.out.println("�̸� : "+name);
	}
	public void printage(int paramage) {
		age = paramage;
		System.out.println("���� : "+age);
	}
	public void printaddress(String paramaddress) {
		address = paramaddress;
		System.out.println("�ּ� : "+address);
	}
	public void printsex(boolean paramsex) {
		sex = paramsex;
		System.out.println("���� : "+sex);
	}
	
}
