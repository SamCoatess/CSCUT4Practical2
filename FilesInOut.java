import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {


    public static void main(String[] args) throws IOException {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        String inputFileName = "";
        String outputFileName = "";
        boolean inFile = false;
        Scanner scanInputFile = new Scanner(inputFileName);

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        /*
        Creating a scanner object and reading users input
         */
        Scanner userInputInputFile  = new Scanner(System.in);
        System.out.println("Enter the file name you would like to input data from.");
        inputFileName = userInputInputFile.nextLine();
        File inputFile = new File(inputFileName);


          /*
        Creating a scanner object and reading users input
         */
        Scanner userInputOutputFile = new Scanner(System.in);
        System.out.println("Enter the name of the file you would like to output data to");
        outputFileName = userInputOutputFile.nextLine();


        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also).
        // That is, read a line, write a line, loop.


        PrintWriter obj = new PrintWriter(outputFileName);

        while (scanInputFile.hasNextLine()) {
            String Inputname = scanInputFile.next();
            String InputSurname = scanInputFile.next();
            String Inputdateofbirth = scanInputFile.next();

            obj.printf("\n", Inputname, InputSurname, Inputdateofbirth);
        }
        System.out.println("Successfully outputted to file");


    } // main
} // FilesInOut
