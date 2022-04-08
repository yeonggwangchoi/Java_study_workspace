package JavaStudy;

public class PersonMain {
	
	public static void main(String [] args) {
		Person2 per1 = new Person2();
		
		per1.age=23;
		per1.name="ÃÖ¿µ±¤";
		per1.address="°æ±âµµ ¾È¼º½Ã";
		per1.sex=false;
		
		per1.printage(20);
		per1.printname("±è¿µ±¤");
		per1.printaddress("¾È¼º½Ã");
		per1.printsex(true);
	}
}
