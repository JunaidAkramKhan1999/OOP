public class Patient {

    private  String name;
    private int patientAge;
    private String disease;
    private String  patientGender;


    public Patient(String name, int patientAge, String disease, String patientGender) {
        this.name = name;
        this.patientAge = patientAge;
        this.disease = disease;
        this.patientGender = patientGender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }




    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", patientAge=" + patientAge +
                ", disease='" + disease + '\'' +
                ", patientGender='" + patientGender + '\'' +
                '}';
    }
}
