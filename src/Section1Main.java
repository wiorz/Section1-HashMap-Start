import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Section1Main {

    public static void main(String[] args) {
        Scanner in = null;

        // Checking for proper number of command line args
        if (args.length != 1) {
            // System.err.println(
            //        "Input filename  and hashmap command must be provided on command line.");
            System.exit(1);
        }

        // Opening scanner to read input file
        try {
            in = new Scanner(new File(args[0]));

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            e.printStackTrace();
            System.exit(1);
        }

        HashMap<String, Integer> flights = countDepartures(in);

        // TODO: write code here

    }

    public static HashMap<String, Integer> countDepartures(Scanner in) {

        HashMap<String, Integer> airportToNumFlights = new HashMap<String, Integer>();

        // TODO: write code here

        return airportToNumFlights;
    }
}
