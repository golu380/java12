import  java.io.IOException;
import java.io.FileInputStream;
import  java.io.ObjectInputStream;
import  java.lang.ClassNotFoundException;


public class DeserializationDemo  {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee e1 =  (Employee) ois.readObject();

        e1.displayData();
        e1.checking();
        ois.close();
    }
    

}
