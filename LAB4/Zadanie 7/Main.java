import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        try{

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\s18426\\IdeaProjects\\zadaniesiódme\\src\\tekst.txt"));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // Print the content on the console
                System.out.println (strLine);
            }
            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }finally{
          //  in.close();
        }
    }
}
