public class Dog extends Canine
{
   
 public Dog(String nameOfFood, String livesIn)
    
{
       
 super(nameOfFood,livesIn);
   
 }

@Override
  
  public void makeNoise()
   
 {
        
System.out.println("A dog Barks.");
   
 }

@Override
   
 public void eat()
    {
        
System.out.println("Dog eats bones and raw meat");
    }


    
public void displayData() {
       
 System.out.println("A dog");
   
     super.displayData();
    
}

}
