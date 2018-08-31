package Singleton;


import java.util.ArrayList;
import java.util.List;

public class School {
    private School(){}
     private static School sc= new School();
     private static School sc1= new School();
     private static List<School> scList = new ArrayList<School>();

 public static List<School> getvalue(){     //use getter method
        scList.add(sc);
        scList.add(sc1);
        return scList;
    }
    public static void method(){
        System.out.println("back to school");
    }
}


// if the class is constructor is private, we should use static as it is easy to call
//method without creating instance or object.