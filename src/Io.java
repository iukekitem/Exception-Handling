import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io {
    public static void main (String[] args) throws IOException {
        //create file in the same folder as the project
        File file = new File("afile.txt");
        file.createNewFile();
        System.out.println("File " + file.getName() + " created");

        //write on a file
        FileWriter fw = new FileWriter("afile.txt");
        fw.write("Hello from Java.");
        fw.close();
        System.out.println("Data written to file");

        //append on a file
        FileWriter f = new FileWriter("afile.txt", true);
        f.write("\nJava is fun!");
        f.close();
        //System.out.println("Data appended to file");

        //Read data from file
        FileReader fr = new FileReader("afile.txt");
        //System.out.println(fr.read()); reads only ASCI
        int i;
        while ((i = fr.read()) != -1) //manipulate to read the file
            System.out.print((char)i);
        fr.close();

        //There is also a file delete
    }
}
