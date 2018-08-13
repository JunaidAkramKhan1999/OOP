public class Wolf extends Canine {
    public Wolf(String nameOfFood, String livesIn)
    {
        super(nameOfFood,livesIn);
    }
    @Override
    public void makeNoise()
    {
        System.out.println("A wolf Howl.");
    }
    @Override
    public void eat()
    {
        System.out.println("wolf howl");
    }


    public void displayData() {
        System.out.println("A wolf");
        super.displayData();
    }
}

