/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex45;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class ex45code
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