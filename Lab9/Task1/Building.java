public class Building implements CarbonFootPrint {
    private double averageMonthlyKwh;
    private final int months=12;

    public Building(double averageMonthlyKwh){
        this.averageMonthlyKwh=averageMonthlyKwh;
    }

    public double getAverageMonthlyKwh() {
        return averageMonthlyKwh;
    }

    public void setAverageMonthlyKwh(double averageMonthlyKwh) {
        this.averageMonthlyKwh = averageMonthlyKwh;
    }
    public double getCarbonFootPrint(){
        return getAverageMonthlyKwh()*months;
    }
    public void displayData(){
        System.out.println(" Carbon fooot print for bicycle : " + getCarbonFootPrint());
    }

}
