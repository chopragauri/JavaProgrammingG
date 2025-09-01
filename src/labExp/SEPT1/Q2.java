package labExp.SEPT1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Q2 {
    public static void main(String[] args) {
        String file = "/Users/gaurichopra/Desktop/JAVA-cllg/src/labExp/SEPT1/output.txt";
        String data = "Java I/O Streams Example";
        try (FileOutputStream fis= new FileOutputStream(file)){
            int ch;
            fis.write(data.getBytes());
        }catch(FileNotFoundException e){
            System.out.println("File not found"+e.getMessage());
        }catch(IOException e){
            System.out.println("IOException"+e.getMessage());
        }
    }
}
