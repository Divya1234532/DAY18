import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        try
        {
            FileReader fr=new FileReader("test.txt");
            int character;
            while((character=fr.read())!=-1)//end of the file
            {
                System.out.println((char)character);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
