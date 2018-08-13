import java.util.List;

public class Hospital {
    private  String hospitalName;
    private final List<Department> departments;

    public Hospital(String hospitalName, List<Department> departments) {
        this.hospitalName = hospitalName;
        this.departments = departments;
    }



 public  int getNoPatientsInHosptal() {
     int noofPatients = 0;
     List<Patient> patients;
     for (Department dept : departments) {
                  patients = dept.getDoctors().get(0).getPatients();
                  for (Patient p :patients){
                      noofPatients++;
                  }
     }
         return noofPatients;
    }

     public int getTotalDoctorctsInDepartment () {
         int noOfDoctors = 0;
         List<Doctor> doctors;
         for (Department dept : departments) {
             doctors = dept.getDoctors();
             for (Doctor s : doctors) {
                 noOfDoctors++;
             }
         }

         return noOfDoctors;
     }

 }



