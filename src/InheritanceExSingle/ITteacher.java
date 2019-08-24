package InheritanceExSingle;

public class ITteacher extends Teacher {       // use the keyword : extends //
    public String mainSubject = "Java";        // it indicates that a class is inherited from another class
    public static void main(String args[]){
        ITteacher obj = new ITteacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.occupation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}


