package JavaStudy;

public class StudentmMain {
	
	public static void main(String [] arg) {
		Student st1=new Student();
		
		st1.age=20;
		st1.adress="경기도 안성시";
		st1.studentnum="18350201";
		st1.phonenum="010-9943-7811";
		
		Student st2=new Student();
		
		st2.age=30;
		st2.adress="경기도 안성시";
		st2.studentnum="18350221";
		st2.phonenum="010-9965-7811";
		
		st1.printage();
		st1.printadresss();
		st1.printphonenum();
		st1.printsttnum();
		
		st2.printage();
		st2.printadresss();
		st2.printphonenum();
		st2.printsttnum();
	}
}
