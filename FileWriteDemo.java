import java.io.*;

public class FileWriteDemo {

    public static void main(String args[]) {

        try{

            FileWriter fw=new FileWriter("test.txt");

            fw.write("Hello Java");

            fw.close();

            System.out.println("File Created");

        }

        catch(Exception e){

            System.out.println(e);

        }

    }
}
