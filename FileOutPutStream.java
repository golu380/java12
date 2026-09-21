import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
    public static void main(String[] args) throws IOException {
        System.out.println("hii");

        FileOutputStream fos = new FileOutputStream("sakr1.txt");
        String message = "Welcom to advance java";

        byte[] data = message.getBytes();
        // for (int i = 0;i<data.length;i++){
        //     System.out.print(data[i] + " ");
        // }

        fos.write(data);
        fos.close();
        
    }
}
