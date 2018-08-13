public  abstract class Animal {
    private String nameOfFood;
    private String livesIn;



    public String getNameOfFood() {
        return nameOfFood;
    }


    public String getLivesIn() {
        return livesIn;
    }

   public Animal(String nameOfFood,String livesIn){
        this.nameOfFood=nameOfFood;
        this.livesIn=livesIn;
   }
  public abstract void eat();
    public abstract void makeNoise();
    public abstract void sleep();
    public abstract void move(int noOfSteps);
    public abstract void displayData();
}
