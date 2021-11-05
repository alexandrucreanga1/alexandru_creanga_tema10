

public class Main {


    public static void main(String[] args) {

        AthleteRepository athleteRepository = new AthleteRepository();



        // loading data from CSV >>>>>>>>>>>>
        athleteRepository.readAthletesFromCSV();
        System.out.println("---------------------------------------------------------------------");

        //preseting data added to list >>>>>>>>>>>>>>>>
        System.out.println(athleteRepository.getAthleteList());
        System.out.println("---------------------------------------------------------------------");


        //sorting TotalList by best final time >>>>>>>>>>>>>>>>>>>>>>>
        athleteRepository.sortAthletesByFinalSkitiming(athleteRepository.athleteList);
        System.out.println("---------------------------------------------------------------------");


        // sorting only best top 3 total time >>>>>>>>>>>>>>>>>>>>>>>>
        athleteRepository.getTop3Ranking(athleteRepository.athleteList,3);
        System.out.println("---------------------------------------------------------------------");

    }
}
































// tot ce este mai jos este din versiunea1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


//        readAthletesFromCSV();
//        //countTheTargetsFirst(athleteList.get(0));
//        //System.out.println("Testare = " + countTheTargetsFirst("xxox") * 10);
//
//        totalMissing(athleteList.get(2));
//        totalMissing(athleteList.get(0));
//        totalMissing(athleteList.get(1));
//
//        calculatingFinalTime(athleteList.get(0));
//        calculatingFinalTime(athleteList.get(1));
//        calculatingFinalTime(athleteList.get(2));
//        int finalTime = calculatingFinalTime(athleteList.get(0)) + (totalMissing(athleteList.get(0)) * 10);
//        System.out.println("Total finalTime is for " + athleteList.get(0) + " is: " + finalTime);
//
//        iterateList(athleteList.get(0));


// }


//    private static void readAthletesFromCSV() {
//        Path fileIn = new File("resources/athletesIN.csv").toPath();
//        System.out.println(fileIn.toAbsolutePath());
//        try (BufferedReader reader = Files.newBufferedReader(fileIn)) {
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                athleteList.add(getAthletesFromCsvLine(line));
//            }
//        } catch (IOException x) {
//            System.out.println("IOException: " + x);
//        }
//        System.out.println(athleteList.size() + " athletes.");
//    }
//
//    public static Athlete getAthletesFromCsvLine(String line) {
//        String[] tokens = line.split(",");
//        if (tokens.length != 7) {
//            throw new IllegalArgumentException();
//        }
//        int athleteNumber = Integer.parseInt(tokens[0].trim());
//        String athleteName = tokens[1];
//        String countryCode = tokens[2];
//        String skiTimeResultMinutesSeconds = tokens[3];
//        String firstShootingRage = tokens[4];
//        String secondShootingRage = tokens[5];
//        String thirdShootingRange = tokens[6];
//        return new Athlete(athleteNumber, athleteName, countryCode, skiTimeResultMinutesSeconds, firstShootingRage, secondShootingRage, thirdShootingRange);
//    }
//
//
//    public static List<Athlete> getAthleteList() {
//        return athleteList;
//    }
////TODO aici vezi ca nu e bine. Dar cum ?
//
//    public static void iterateList (Athlete athlete) {
//        for (int i = 0; i < athleteList.size(); i++) {
//            int totalMissings = (int) (athlete.getFirstShootingRage().chars().filter(ch -> (ch == 'o')).count() +
//                    athlete.getSecondShootingRage().chars().filter(ch -> (ch == 'o')).count() +
//                    athlete.getThirdShootingRange().chars().filter(ch -> (ch == 'o')).count());
//            System.out.println("Total missings for ID " + athlete.getAthleteNumber() + " is " + totalMissings);
//        }
//
//    }
//
//
//    public static int totalMissing(Athlete athlete) {
//        int missingFirst = (int) athlete.getFirstShootingRage().chars().filter(ch -> (ch == 'o')).count();
//        int missingSecond = (int) athlete.getSecondShootingRage().chars().filter(ch -> (ch == 'o')).count();
//        int missingThird = (int) athlete.getThirdShootingRange().chars().filter(ch -> (ch == 'o')).count();
//        int totalMissing = missingFirst + missingSecond + missingThird;
//        System.out.println("TotalMissing for ID " + athlete.getAthleteNumber() + " is " + totalMissing + " points");
//        return totalMissing;
//    }
//
//    public static int calculatingFinalTime(Athlete athlete) {
//        String[] tokens = athlete.getSkiTimeResultMinutesSeconds().split(":");
//        if (tokens.length != 2) {
//            throw new IllegalArgumentException();
//        }
//        int minutesConvertToSeconds = (Integer.parseInt(tokens[0].trim()) * 60) + (Integer.parseInt(tokens[1].trim()));
//        System.out.println("Minutes to seconds: " + (Integer.parseInt(tokens[0].trim()) * 60) + " Seconds: " + (Integer.parseInt(tokens[1].trim())));
//        return minutesConvertToSeconds;
//    }


//        public static int countTheTargetsFirst(Athlete athlete) {
//            char point = 'x';
//            int countFirst = 0;
//            for (int i = 0; i < firstShootingRage.length(); i++) {
//                if (firstShootingRage.charAt(i) == point) {
//                    countFirst++;
//                }
//            }
//            System.out.println("Hit targets: " + countFirst);
//            return countFirst;
//        }
//
//        public static int countTheTargetsSecond(String secondShootingRage) {
//            char point = 'x';
//            int countSecond = 0;
//            for (int i = 0; i < secondShootingRage.length(); i++) {
//                if (secondShootingRage.charAt(i) == point) {
//                    countSecond++;
//                }
//            }
//            System.out.println(countSecond);
//            return countSecond;
//        }
//
//        public static int countTheTargetsThird(String thirdShootingRange) {
//            char point = 'x';
//            int countThird = 0;
//            for (int i = 0; i < thirdShootingRange.length(); i++) {
//                if (thirdShootingRange.charAt(i) == point) {
//                    countThird++;
//                }
//            }
//            System.out.println(countThird);
//            return countThird;
//        }


//}
