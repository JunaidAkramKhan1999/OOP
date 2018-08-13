public class Car implements CarbonFootPrint {
    private double averageYearlyMiles;
    private double averageMPG;
    private final int kgCO2PerMile=9;

    public Car(double averageYearlyMiles,double averageMPG){
        this.averageYearlyMiles=averageYearlyMiles;
        this.averageMPG=averageMPG;
    }

    public double getAverageYearlyMiles() {
        return averageYearlyMiles;
    }

    public void setAverageYearlyMiles(double averageYearlyMiles) {
        this.averageYearlyMiles = averageYearlyMiles;
    }

    public double getAverageMPG() {
        return averageMPG;
    }

    public void setAverageMPG(double averageMPG) {
        this.averageMPG = averageMPG;
    }
    public  double getCarbonFootPrint() {
        return ((getAverageYearlyMiles() * getAverageMPG()) * kgCO2PerMile);
    }
    public void displayData(){
        System.out.println(" Carbon fooot print for car : " + getCarbonFootPrint());
    }

}
