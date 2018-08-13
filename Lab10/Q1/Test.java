import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {



        // list of Patients :
        Patient patient1 = new Patient("junaid",19,"Fever","Male");
        Patient patient2 = new Patient("khan",20,"Fever","Male");
        List<Patient>  patentList1= new ArrayList<>();
        patentList1.add(patient1);
        patentList1.add(patient2);
        Patient patient3 = new Patient("ali",20,"heart","Male");
        Patient patient4 = new Patient("shahzaib",19,"heart","Male");
        List<Patient>  patentList2= new ArrayList<>();
        patentList2.add(patient3);
        patentList2.add(patient4);
        Patient patient5 = new Patient("yasir",19,"Lungs","Male");
        Patient patient6 = new Patient("usman",19,"Lungs","Male");
        List<Patient>  patentList3= new ArrayList<>();
        patentList3.add(patient5);
        patentList3.add(patient6);
        Patient patient7 = new Patient("murtaza",21,"Legs","Male");
        Patient patient8 = new Patient("haseeb",22,"legs","Male");
        List<Patient>  patentList4= new ArrayList<>();
        patentList4.add(patient7);
        patentList4.add(patient8);
        Patient patient9 = new Patient("jhanzaib",14,"Fever","Male");
        Patient patient10 = new Patient("faizan",15,"Fever","Male");
        List<Patient>  patentList5= new ArrayList<>();
        patentList5.add(patient9);
        patentList5.add(patient10);
        Patient patient11 = new Patient("hamza",16,"liver","Male");
        Patient patient12 = new Patient("huzaifa",14,"liver","Male");
        List<Patient>  patentList6= new ArrayList<>();
        patentList6.add(patient11);
        patentList6.add(patient12);
        Patient patient13 = new Patient("saad",14,"Fever","Male");
        Patient patient14 = new Patient("Marij",15,"Fever","Male");
        List<Patient>  patentList7= new ArrayList<>();
        patentList7.add(patient13);
        patentList7.add(patient14);
        Patient patient15 = new Patient("Dua",13,"heart","Female");
        Patient patient16 = new Patient("Arooj",19,"heart","Female");
        List<Patient>  patentList8= new ArrayList<>();
        patentList8.add(patient15);
        patentList8.add(patient16);
        Patient patient17 = new Patient("yasmin",19,"Fever","Female");
        Patient patient18 = new Patient("shazia",19,"Fever","Female");
        List<Patient>  patentList9= new ArrayList<>();
        patentList9.add(patient17);
        patentList9.add(patient18);





        //Doctors for Cardiology :
        Doctor doctorCardiology1 = new Doctor("Dr. Junaid","Heart SpecialList",patentList1);
        Doctor doctorCardiology2 = new Doctor("Dr. Faizan","SpecialList",patentList2);
        Doctor doctorCardiology3 = new Doctor("Dr. Anus","Heart SpecialList",patentList3);
        List<Doctor> listOfCardiology = new ArrayList<Doctor>();
        listOfCardiology.add(doctorCardiology1);
        listOfCardiology.add(doctorCardiology2);
        listOfCardiology.add(doctorCardiology3);

        //Doctors For Critical :
        Doctor doctorCritical1 = new Doctor("Dr. Usmain","Critical SpecialList",patentList4);
        Doctor doctorCritical2 = new Doctor("Dr. Murtaza","Critical SpecialList",patentList5);
        Doctor doctorCritical3 = new Doctor("Dr. Ali Yawer","Critical SpecialList",patentList6);
        List<Doctor> listOfCritical = new ArrayList<Doctor>();
        listOfCritical.add(doctorCritical1);
        listOfCritical.add(doctorCritical2);
        listOfCritical.add(doctorCritical3);


        //Doctors For Neurology:
        Doctor doctorNeurology1 = new Doctor("Dr. Yasir","Neurology SpecialList",patentList7);
        Doctor doctorNeurology2 = new Doctor("Dr. Shazaib","Neurology SpecialList",patentList8);
        Doctor doctorNeurology3 = new Doctor("Dr. Murtaza","Neurology SpecialList",patentList9);
        List<Doctor> listOfNeurology = new ArrayList<Doctor>();
        listOfNeurology.add(doctorNeurology1);
        listOfNeurology.add(doctorNeurology2);
        listOfNeurology.add(doctorNeurology3);



        //Departments
        Department cardology = new Department("Cardiology",listOfCardiology);
        Department criticalCare = new Department("Critical Care",listOfCritical);
        Department neurology = new Department("Neurology",listOfNeurology);

        List<Department> listOfDepatment= new ArrayList<Department>();
        listOfDepatment.add(cardology);
        listOfDepatment.add(criticalCare);
        listOfDepatment.add(neurology);

        //Hospital
        Hospital H1 = new Hospital("Aga Khan",listOfDepatment);
        System.out.println("Department List"+listOfDepatment);
        System.out.println("Total Doctors In the Departments : "+H1.getTotalDoctorctsInDepartment());
        System.out.println( "Num of patients in One department :"+H1.getNoPatientsInHosptal());

    }




}
