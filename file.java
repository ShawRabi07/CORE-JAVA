import java.io.*;
import io.IOException.*;
public class file {
    public static void main(String[] args) throws IOException, ArithmeticException{
        File f = new File("C:\\LPU3");

        f.mkdir();
        File fi = new File("C:\\LPU3\\hey");
        fi.mkdir();

        File f3 = new File("C:\\LPU\\neww.txt");
        f3.createNewFile();

        File[] file = f.listFiles();

        for(File ff:file){
            System.out.println(ff.getName());
        }


        try{
            FileWriter wr = new FileWriter("neww.txt");
            wr.write("Hello, this a file ");
            wr.close();
        }
        catch(IOException e){
            System.out.println("an error occured" + e.getMessage());
        }
    }
}
