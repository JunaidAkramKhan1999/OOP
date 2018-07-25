public class TestFan{
	public static void main(String[] args){
	
	Fan  fan1 = new Fan(Fan.fast,true,10,"yellow");
	System.out.println(fan1.toString());
	
	Fan  fan2 = new Fan(Fan.medium,false,5,"blue");
	System.out.println(fan2.toString());

}
}
	