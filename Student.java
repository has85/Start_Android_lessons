/**
 * Created by nurlan.hasanov on 10/7/2016.
 */
public class Student {

    private  String FirstName;
   private String LastName;

    public String GetName(){
        return FirstName + LastName;

    }


    public void  SetName(String FirstName, String LastName) {

        this.FirstName = FirstName;
        this.LastName = LastName;


    }




}
