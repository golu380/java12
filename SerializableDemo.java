import  java.io.Serializable;
import  java.io.IOException;
import  java.io.FileOutputStream;
import  java.io.ObjectOutputStream;

class Employee implements  Serializable{
    String name;
    int empid;
    String doj;
    String dept;
    boolean isManager ;

    public Employee(String name, int empid,String dept,String doj, boolean isManager){
        this.name = name;
        this.empid = empid;
        this.dept = dept;
        this.doj = doj;
        this.isManager = isManager;

    }

    void displayData(){
        System.out.println("employee name is "+name);
         System.out.println("employee id is "+empid);
          System.out.println("employee department is "+dept);
           System.out.println("employee doj is "+doj);
             System.out.println("is it manger "+ isManager);
           
    }
    void checking(){
        System.out.println("hi i am checking it");
    }
}

public class SerializableDemo  {
    public static void main(String [] args) throws IOException{
        

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        Employee e1 = new Employee("sakir", 11, "it", "12/01/2034", true);
        oos.writeObject(e1);
        oos.close();

        System.out.println("state saved successfully");


        System.out.println("amit");
    }
}
