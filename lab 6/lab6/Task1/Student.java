public class Student extends Person {
    private String enrollmentId;
    private float gpa;

    public Student(String name, String address, int phoneNumber, String emailAddress, String enrollmentId, float gpa) {
        super(name, address, phoneNumber, emailAddress);
        this.enrollmentId = enrollmentId;
        this.gpa = gpa;
    }

    public String getenrollmentId() {
        return enrollmentId;
    }

    public float getgpa() {
        return gpa;
    }

    public void setenrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setgpa(float gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public void displayData() {
        System.out.println("\n student name :" + getname() + "\n student address :" + getaddress() + "\n student phone number :" + getphoneNumber() + "\n student email address :" + getemailAddress() + "\n student ID : " + getenrollmentId() + "\n Student Gpa :" + getgpa());
    }
}
	