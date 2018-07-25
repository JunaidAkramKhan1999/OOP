public class Test {
	public static void main (String[] args ){

     Person student1 = new Student("junaid akram khan ","Maju baloach colony",03000,"junaid@junaid.com","fa17-bsse-0097",4);
     Person faculty1 = new Faculty("ali khan","Maju Karachi",0300030,"alikhan@alikhan.com","767676-09",40000,8,"HR");


	System.out.println(student1.toString());

	
	student1.displayData();
	
	faculty1.toString();
	faculty1.displayData();
	
}
}