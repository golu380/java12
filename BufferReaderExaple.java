import  java.io.*;

public class BufferReaderExaple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sakir.txt"));

        String line;

        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();

    }
}
