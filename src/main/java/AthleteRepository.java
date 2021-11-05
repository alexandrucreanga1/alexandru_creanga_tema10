import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class AthleteRepository {


    List<Athlete> athleteList = new ArrayList<>();
    List<Athlete> topKlist = new ArrayList<>();


    public void readAthletesFromCSV() {
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

    public Athlete getAthletesFromCsvLine(String line) {
        String[] tokens = line.split(",");
        if (tokens.length != 7) {
            throw new IllegalArgumentException();
        }
        int athleteNumber = Integer.parseInt(tokens[0].trim());
        String athleteName = tokens[1].trim();
        String countryCode = tokens[2].trim();
        String skiTimeResultMinutesSeconds = tokens[3].trim();
        String firstShootingRage = tokens[4].trim();
        String secondShootingRage = tokens[5].trim();
        String thirdShootingRange = tokens[6].trim();
        return new Athlete(athleteNumber, athleteName, countryCode, skiTimeResultMinutesSeconds, firstShootingRage, secondShootingRage, thirdShootingRange);
    }


    public List<Athlete> sortAthletesByFinalSkitiming(List<Athlete> athleteListSorted) {
        athleteListSorted.sort(Comparator.comparing(Athlete::getFinalTimeCalculated));
        System.out.println(athleteListSorted);
        return athleteListSorted;
    }


    public List<Athlete> getTop3Ranking(List<Athlete> athleteListSorted, int numberOfTop) {
        athleteListSorted.sort(Comparator.comparing(Athlete::getFinalTimeCalculated));
        for (int i = 0; i < numberOfTop; i++) {
            topKlist.add(athleteListSorted.get(i));

        }
        System.out.println("See Full List of Top 3: "+topKlist);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Winner - " + topKlist.get(0).getAthleteName() + " " + topKlist.get(0).getSkiTimeResultMinutesSeconds() +
                " (" + topKlist.get(0).getFinalTimeCalculated() / 60 + ":" + topKlist.get(0).getFinalTimeCalculated() % 60
                + " + " + topKlist.get(0).getPenaltySeconds() + ")" + "\n" +
        "Runner-up - " + topKlist.get(1).getAthleteName() + " " + topKlist.get(1).getSkiTimeResultMinutesSeconds() +
                " (" + topKlist.get(1).getFinalTimeCalculated() / 60 + ":" + topKlist.get(1).getFinalTimeCalculated() % 60
                + " + " + topKlist.get(1).getPenaltySeconds() + ")" + "\n" +
                "Third Place - " + topKlist.get(2).getAthleteName() + " " + topKlist.get(2).getSkiTimeResultMinutesSeconds() +
                " (" + topKlist.get(2).getFinalTimeCalculated() / 60 + ":" + topKlist.get(2).getFinalTimeCalculated() % 60
                + " + " + topKlist.get(2).getPenaltySeconds() + ")");
        return topKlist;
    }


    @Override
    public String toString() {
        return "AthleteRepository{" +
                "athleteList=" + athleteList +
                '}';
    }

    public List<Athlete> getTopKlist() {
        return topKlist;
    }

    public List<Athlete> getAthleteList() {
        return athleteList;
    }
}
