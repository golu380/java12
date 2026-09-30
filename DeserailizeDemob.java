import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;


public class DeserailizeDemob {
    public static void main(String [] args){
        System.out.println("hiii");

        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objectstate.ser"));
            Student student =  (Student)ois.readObject();
            ois.close();
            student.displayData();
            
        }catch(IOException err){
            System.out.println(err);
        }catch(ClassNotFoundException err){
            System.out.println(err);
        }
    }
}


