import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        int [] a = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
        String [] b = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        System.out.println("Original numeric array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));

        System.out.println("Original string array : "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Sorted string array : "+Arrays.toString(b));

        int sum = 0;

        for (int num : a)
        {
            sum=sum+num;
        }
        System.out.println("Sum of numeric array is:"+sum);

        double total = 0;
        for(int i=0; i<a.length; i++){
            total = total + a[i];
        }
        double average = total / a.length;
        System.out.format("The average of numeric array is: %.3f", average);
    }
}
