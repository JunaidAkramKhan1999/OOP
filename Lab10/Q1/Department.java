import java.util.List;

public class Department {
    private  String name;
    private final List<Doctor>  doctors;


    public Department(String name, List<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }



    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", doctors=" + doctors +
                '}';
    }
}
