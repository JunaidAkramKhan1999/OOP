public class Tiger extends Feline{
    public Tiger(String nameOfFood, String livesIn)
    {
        super(nameOfFood,livesIn);
    }
    @Override
    public void makeNoise()
    {
        System.out.println("A Tiger roar.");
    }
    @Override
    public void eat()
    {
        System.out.println("Tiger eats bones and raw meat");
    }


    public void displayData() {
        System.out.println("A Tiger");
        super.displayData();
    }
}
