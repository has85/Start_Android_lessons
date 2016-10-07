/**
 * Created by nurlan.hasanov on 10/7/2016.
 */
public class methods_lesson {
    public static void main(String[] args) {
        Student student = new Student();
        student.SetName("John"," Malkovich");
        String fullname = student.GetName();
        System.out.println(fullname);
    }

}
