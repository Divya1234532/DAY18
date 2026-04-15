import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Write Using FileWriter");
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
