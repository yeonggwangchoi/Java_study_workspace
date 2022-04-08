package JavaStudy;

public class Person2 {
	
	int age;
	String name, address;
	boolean sex;
	
	public void printname(String paramname) {
		name = paramname;
		System.out.println("이름 : "+name);
	}
	public void printage(int paramage) {
		age = paramage;
		System.out.println("나이 : "+age);
	}
	public void printaddress(String paramaddress) {
		address = paramaddress;
		System.out.println("주소 : "+address);
	}
	public void printsex(boolean paramsex) {
		sex = paramsex;
		System.out.println("성별 : "+sex);
	}
	
}
