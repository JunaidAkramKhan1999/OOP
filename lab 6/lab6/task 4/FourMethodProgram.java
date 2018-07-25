public class FourMethodProgram{



public static  int max(int x, int y){
	if ( x > y ) {
	return x;
	} else {
	return y;
} 
}

public static double  max(double x, int y){
	if ( x > y ) {
	return x;
	} else {
	return y;
} 
}

public static  int max(int x, int y, int z){
	if ( x > y  && x > z) {
	return x;
	} else if (y > x && y > z) {
	return y;
	} else {
	return z ;
} 
}

public  static  double max(double x, double y,double z){
	if ( x > y  && x > z) {
	return x ;
	} else if (y > x && y > z) {
	return y ;
	} else {
	return z ;
}
}
}
class Test {
	public static void main (String[] args){
	
	System.out.println("The Maximum value of Two interger num is :"+FourMethodProgram.max(10,7));
	System.out.println("The Maximum value of Two double  num is :"+FourMethodProgram.max(8,7));
	System.out.println("The Maximum value of Three interger num is :"+FourMethodProgram.max(6,7,8));
	System.out.println("The Maximum value of three  interger num is :"+FourMethodProgram.max(6,4,5));
	}
}
	