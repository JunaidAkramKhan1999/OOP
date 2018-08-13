import java.util.ArrayList;
import java.util.Scanner;
public class TestDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("How many animals you want to see : ");

        int n1 = input.nextInt();

        System.out.println("Enter the Type of Animals \ncat \ntiger \nlion \nhippo \nwolf \ndog");
        // ArrayList<Computer> computerList=new ArrayList<Computer>();
        for (int i = 0; i <= n1; i++) {
            String p1 = input.nextLine();
            ArrayList<Animal> animals = new ArrayList<Animal>();
            Animal cat = new Cat("meat", "forest");
            Animal tiger = new Tiger("meat", "Forest");
            Animal lion = new Lion("meat", "forest");
            Animal hippo = new Hippo("grass", "forest");
            Animal wolf = new Wolf("meat", "forest");
            Animal dog = new Dog("milk", "zoo");
                if (p1.equals("cat")) {
                    cat.displayData();
                    cat.makeNoise();
                    cat.eat();
                    animals.add(cat);
                }
                if (p1.equals("tiger")) {

                    tiger.displayData();

                    tiger.makeNoise();

                    tiger.eat();
                    animals.add(tiger);
                }
                if (p1.equals("lion")) {

                    lion.displayData();

                    lion.makeNoise();

                    lion.eat();

                   animals.add(lion);
                }
                if (p1.equals("hippo")) {

                    hippo.displayData();
                    hippo.makeNoise();
                    cat.eat();
                    animals.add(hippo);

                }
                if (p1.equals("wolf")) {

                    wolf.displayData();

                    wolf.makeNoise();

                    wolf.eat();
                     animals.add(wolf);
                }
                if (p1.equals("dog")) {

                    dog.displayData();

                    dog.makeNoise();

                    dog.makeNoise();
                animals.add(dog);
                }
            System.out.println(animals);
            }

        }

    }