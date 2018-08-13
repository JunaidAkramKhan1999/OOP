public class Cat extends Feline{

    public Cat(String nameOfFood, String livesIn) {
       
 super(nameOfFood, livesIn);
    }

  
  @Override
    public void makeNoise() {
        System.out.println("A cat Meow.");
    }

  
  @Override
    public void eat() {
        
System.out.println("Cat eats milk and raw meat");
    }



    public void displayData() {
        System.out.println("A Cat");
        super.displayData();
    }

}