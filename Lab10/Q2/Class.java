import java.util.Map;
import java.util.TreeMap;

public class Class {





    public void getStudentSerialNums(String name) {
        Map<String, String> listOfSerialNum = new TreeMap<>();
        listOfSerialNum.put("junaid", "FA17-BSSE-0097");
        listOfSerialNum.put("usman", "FA17-BSSE-0084");
        listOfSerialNum.put("murtaza", "FA17-BSCS-0106");
        listOfSerialNum.put("Shazaib", "FA17-BSSE-0075");
        listOfSerialNum.put("faizan", "FA17-BSSE0079");
        listOfSerialNum.put("hamza", "FA17-BSSE-0082");

        for (Map.Entry<String, String> entry : listOfSerialNum.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }
    }
    public void getStudentMarks(String name){
        Map<String,Integer> listOfStudentMarks = new TreeMap<>();
        listOfStudentMarks.put("junaid", 90);
        listOfStudentMarks.put("usman", 80);
        listOfStudentMarks.put("murtaza", 70);
        listOfStudentMarks.put("Shazaib", 60);
        listOfStudentMarks.put("faizan", 84);
        listOfStudentMarks.put("hamza", 55);

        for (Map.Entry<String,Integer> entry : listOfStudentMarks.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }

    }
    public void getStudentQuizNum(String name){
        Map<String,Integer> listOfStudentQuizMarks = new TreeMap<>();
        listOfStudentQuizMarks.put("junaid", 40);
        listOfStudentQuizMarks.put("usman", 60);
        listOfStudentQuizMarks.put("murtaza", 60);
        listOfStudentQuizMarks.put("Shazaib", 80);
        listOfStudentQuizMarks.put("faizan", 74);
        listOfStudentQuizMarks.put("hamza", 85);

        for (Map.Entry<String,Integer> entry : listOfStudentQuizMarks.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }

    }
    public void getStudentAssignmentNum(String name){
        Map<String,Integer> listOfStudentAssiMarks = new TreeMap<>();
        listOfStudentAssiMarks.put("junaid", 30);
        listOfStudentAssiMarks.put("usman", 60);
        listOfStudentAssiMarks.put("murtaza", 80);
        listOfStudentAssiMarks.put("Shazaib", 70);
        listOfStudentAssiMarks.put("faizan", 94);
        listOfStudentAssiMarks.put("hamza", 66);

        for (Map.Entry<String,Integer> entry : listOfStudentAssiMarks.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }

    }



}
