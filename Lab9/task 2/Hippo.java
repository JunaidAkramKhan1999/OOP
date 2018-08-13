public class Hippo extends Animal {
    public Hippo(String nameOfFood, String livesIn)
    {
        super(nameOfFood,livesIn);
    }
    public void makeNoise()
    {
        System.out.println("A hippo roar.");
    }

    @Override
    public void sleep() {
        System.out.println("2 hours");
    }

    @Override
    public void move(int noOfSteps) {

    }

    public void eat()
    {
        System.out.println("A hippo eat grass");
    }


    public void displayData() {
        System.out.println("A Hippo");
    }
}
