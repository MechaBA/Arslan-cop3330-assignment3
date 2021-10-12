package ex42;
import java.io.*;
import java.util.*;
public class ex42pseudo
{
    //Part 1: Coding
    public void printPars(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while(sc.hasNext())
            {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error.");
        }
    }
    //Part 2: Create print
    public static void main(String[] args)
    {
        ex42code emp = new ex42code();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("--------------------------------------");
        emp.printPars("exercise42_input.txt");
    }
}