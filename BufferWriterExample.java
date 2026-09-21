import java.io.BufferedWriter;
import java.io.FileWriter;
import  java.io.IOException;

public class BufferWriterExample{
    public static void main(String [] args) throws IOException{
        System.out.println("hii");

        FileWriter fw = new FileWriter("sakir.txt");

        BufferedWriter  bw = new BufferedWriter(fw);

        bw.write("Hi i am learning file handling");
        bw.newLine();
        bw.write("My name is sakir");
        bw.newLine();
        bw.write("advance java");
        bw.close();



    }
}