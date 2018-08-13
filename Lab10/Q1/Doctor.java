import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private  String designation;
    private List<Patient> patients;


    public Doctor(String name, String designation, List<Patient> patients) {
        this.name = name;
        this.designation = designation;
        this.patients = patients;
    }

    public Doctor(){
        patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Patient> getPatients() {
        return patients;
    }




    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", patients=" + patients +
                '}';
    }
}
