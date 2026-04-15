import java.io.*;

public class FileHandling {
    /*public static void main(String[] args) throws IOException {
        File newfile=new File("test.txt");
        if(newfile.createNewFile())
        {
            System.out.println("File is Created");
        }
        else
        {
            System.out.println("Not able to create file");
        }
    }
                    (OR)
    */
    public static void main(String[] args) {
        try {
            File newfile = new File("text.txt");

            if (newfile.createNewFile()) {
                System.out.println("File created at: " + newfile.getName());
            } else {
                System.out.println("File already exists at: " + newfile.getName());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


