public class Lion extends Feline{
    public Lion(String nameOfFood, String livesIn) {
        super(nameOfFood, livesIn);
    }

    @Override
    public void makeNoise() {
        System.out.println("A Lion roar.");
    }

    @Override
    public void eat() {
        System.out.println(" Dogs eat raw meat");
    }


    public void displayData() {
        System.out.println("A Lion");
        super.displayData();
    }

}
