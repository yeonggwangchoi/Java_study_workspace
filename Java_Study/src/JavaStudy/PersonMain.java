package JavaStudy;

public class PersonMain {
	
	public static void main(String [] args) {
		Person2 per1 = new Person2();
		
		per1.age=23;
		per1.name="�ֿ���";
		per1.address="��⵵ �ȼ���";
		per1.sex=false;
		
		per1.printage(20);
		per1.printname("�迵��");
		per1.printaddress("�ȼ���");
		per1.printsex(true);
	}
}
