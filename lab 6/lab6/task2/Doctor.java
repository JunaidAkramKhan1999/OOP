public class Doctor extends Protector {


    public Doctor() {
    }

    public Doctor(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Droctor can move ");
    }

    public void speak(){
        System.out.println("Dr can speck  call");
    }

    public void CallSafeguard(){
        System.out.println("Call the safeguard to give the information \n prepare car/plan/guns for the safeguard  ");
    }
}



