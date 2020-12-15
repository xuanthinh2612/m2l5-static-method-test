public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod obj1 = new StaticMethod(25,"Trung");
        StaticMethod obj2 = new StaticMethod(25,"Nam");
        StaticMethod obj3 = new StaticMethod(25,"Hoang");
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
