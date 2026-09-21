//Main2.java

import java.io.FileReader;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try{
             FileReader fr = new FileReader("student.txt");
             int ch;

             while((ch = fr.read()) != -1){
                System.out.print((char)ch);
             }
             fr.close();

        }catch(IOException err){
            System.out.println(err);
        }
       
    }
}
