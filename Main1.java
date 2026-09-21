//Main1.java

import java.io.FileWriter;
import java.io.IOException;
public class Main1 {
    public  static void main(String [] args) {

        try{
              FileWriter fw = new FileWriter("student.txt",true);
        fw.write("Name:Amit\n");
        fw.write("Course :Advance java\n");
        fw.write("Marks: 100\n");
        fw.close();


       
        }catch(IOException err){
            System.out.println(err);
        }

       System.out.println("hii");
    }
}
