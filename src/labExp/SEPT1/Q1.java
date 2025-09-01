package labExp.SEPT1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Q1 {
    public static void main(String[] args) {
    String file="/Users/gaurichopra/Desktop/JAVA-cllg/src/labExp/SEPT1/output.txt";
    try(FileInputStream fis = new FileInputStream(file)){
        int ch;
        while((ch= fis.read()) != -1){
            System.out.print((char)ch);
        }
    }catch(FileNotFoundException e){
        System.out.println("File not found"+e.getMessage());
    }catch(IOException e){
        System.out.println("IOException"+e.getMessage());
    }
    }
}

