public class Biciyle  implements CarbonFootPrint{
 public double yearlyMiles;
 public final int caloriePerMile=34;
public Biciyle(double yearlyMiles){
    this.yearlyMiles=yearlyMiles;
}

    public double getYearlyMiles() {
        return yearlyMiles;
    }

    public void setYearlyMiles(double yearlyMiles) {
        this.yearlyMiles = yearlyMiles;
    }


    @Override
    public double getCarbonFootPrint(){
           return yearlyMiles*caloriePerMile;
    }

    public void displayData(){
    System.out.println(" Carbon fooot print for bicycle : " + getCarbonFootPrint());
    }

}
