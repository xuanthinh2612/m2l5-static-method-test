public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    StaticMethod(int rollno, String name){
        this.rollno = rollno;
        this.name = name;

    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno+"\n"+name+"\n"+college);
    }
}
