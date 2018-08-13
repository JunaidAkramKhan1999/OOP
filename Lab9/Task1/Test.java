import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> myCarbon = new ArrayList<>();
        CarbonFootPrint bicycle = new Biciyle(132.0);
        CarbonFootPrint buiding = new Building(1232);
        CarbonFootPrint car = new Car(1212, 1223);

        myCarbon.add("bicycle");
        myCarbon.add("building");
        myCarbon.add("car");

        for (String g : myCarbon) {
            System.out.println("For the " + g + " :");
            if (g == "bicycle") {
                bicycle.getCarbonFootPrint();
                bicycle.displayData();
            }
                if (g == "building") {
                    buiding.getCarbonFootPrint();
                    buiding.displayData();
                }
                if (g == "car") {
                    car.getCarbonFootPrint();
                    car.displayData();
                }

        }
    }
}
