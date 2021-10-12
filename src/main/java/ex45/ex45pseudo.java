package ex45;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class ex45pseudo
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("exercise45_input.txt");
        Scanner sc = new Scanner(file);
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter Output: ");
        String outputFile = s.next();
        FileWriter writer = new FileWriter(outputFile);
        try
        {
            while(sc.hasNext())
            {
                String user = sc.nextLine();
                user = user.replaceAll("utilize", "use");
                writer.write(user);
                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }
        writer.close();
        System.out.println("\nFinished");
    }
}