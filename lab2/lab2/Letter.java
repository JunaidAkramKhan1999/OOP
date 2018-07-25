import java.util.Scanner;
class Letter{
	public static void main (String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("input an alphaber :");
	String  input = in.next();	
	
	boolean upercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
	boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;

	boolean vowel = input.equals("a") || input.equals("e") || input.equals("u") || input.equals("i") || input.equals("o") ;
	
	if ( input.length() > 1 ){
	System.out.println("not an single charater plz enter single charater");
	 } else if  (!(upercase || lowercase )){
	System.out.println(" not a alphabet plz enter alphabet i upercase or lowercase");
	} else if ((upercase || lowercase) == vowel){
	System.out.println(" Letter is vowel");
	}else {
	System.out.println("Not a vowel ");
}
	
}
}