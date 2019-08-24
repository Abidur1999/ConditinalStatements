package MyslideShow1;

public class TestStudent extends  StudentExam{
    public static void main(String[] args) {
        StudentExam s = new StudentExam();
        // * First case
        // assign values to private variable through getter/setter//
        s.setName("Sonia");
        System.out.println(s.getName());
        // * Second Case
        // * doest not give access to assign value to private variable (rollNo), no getter and setter//


    }



}

