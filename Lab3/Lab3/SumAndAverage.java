import java.util.Arrays;
public class SumAndAverage {
	public static void main(String[] args){
	int sum = 0;
	double average = 0.0;
	int[] originalArray = {1,5,3,2,4,10,9,24,5,52,42,44,55,6,77,99};

	Arrays.sort(originalArray);
	System.out.println("Sorted  : "+Arrays.toString(originalArray));

	for(int sumNo : originalArray) {
		 sum += sumNo ;
		average = sum /originalArray.length;
           }
System.out.println("Sum NUmber: " + sum);

	System.out.println("last index num"+originalArray.length);
	
	System.out.println("average :"+average);


}
}