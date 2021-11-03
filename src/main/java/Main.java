import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {


    static List<Athlete> athleteList = new ArrayList<>();

    public static void main(String[] args) {

        readAthletesFromCSV();
    }


    private static void readAthletesFromCSV () {
        Path fileIn = new File("resources/athletesIN.csv").toPath();
        System.out.println(fileIn.toAbsolutePath());
        try (BufferedReader reader = Files.newBufferedReader(fileIn)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                athleteList.add(getAthletesFromCsvLine(line));
            }
        } catch (IOException x) {
            System.out.println("IOException: " + x);
        }
        System.out.println(athleteList.size() + " athletes.");
    }

    public static Athlete getAthletesFromCsvLine (String line) {
        String [] tokens = line.split(",");
        if(tokens.length !=7) {
            throw new IllegalArgumentException();
        }
        int athleteNumber = Integer.parseInt(tokens[0].trim());
        String athleteName = tokens[1];
        String countryCode = tokens[2];
        String skiTimeResultMinutesSeconds = tokens[3];
        String firstShootingRage = tokens[4];
        String secondShootingRage = tokens[5];
        String thirdShootingRange = tokens[6];
        return new Athlete(athleteNumber,athleteName,countryCode,skiTimeResultMinutesSeconds,firstShootingRage,secondShootingRage,thirdShootingRange);
    }


}
