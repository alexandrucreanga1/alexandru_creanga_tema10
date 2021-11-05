public class Athlete {

    int athleteNumber;
    String athleteName;
    String countryCode;
    String skiTimeResultMinutesSeconds;
    String firstShootingRage;
    String secondShootingRage;
    String thirdShootingRange;
    int finalTimeCalculated;
    int penaltySeconds;

    public Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResultMinutesSeconds,
                   String firstShootingRage, String secondShootingRage, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResultMinutesSeconds = skiTimeResultMinutesSeconds;
        this.firstShootingRage = firstShootingRage;
        this.secondShootingRage = secondShootingRage;
        this.thirdShootingRange = thirdShootingRange;

        this.penaltySeconds = calculatePenaltyInSeconds(firstShootingRage, secondShootingRage, thirdShootingRange);
        this.finalTimeCalculated = parsingfromStringToInt(skiTimeResultMinutesSeconds) +
                calculatePenaltyInSeconds(firstShootingRage, secondShootingRage, thirdShootingRange);
    }


    public int calculatePenaltyInSeconds(String firstShooting, String secondShooting,
                                           String thirdShooting) {

        return (int) ((firstShooting.chars().filter(ch -> (ch == 'o')).count() +
                secondShooting.chars().filter(ch -> (ch == 'o')).count() +
                thirdShooting.chars().filter(ch -> (ch == 'o')).count())) * 10;
    }

    public int parsingfromStringToInt(String actualTiming) {
        String[] tokens = actualTiming.split(":");
        if (tokens.length != 2) {
            throw new IllegalArgumentException();
        }
      //  int minutesConvertToSeconds = (Integer.parseInt(tokens[0].trim()) * 60) + (Integer.parseInt(tokens[1].trim()));
       // System.out.println("Minutes to seconds: " + (Integer.parseInt(tokens[0].trim()) * 60) + " Seconds: " + (Integer.parseInt(tokens[1].trim())));
        return (Integer.parseInt(tokens[0].trim()) * 60) + (Integer.parseInt(tokens[1].trim()));
    }


    public int getPenaltySeconds() {
        return penaltySeconds;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getSkiTimeResultMinutesSeconds() {
        return skiTimeResultMinutesSeconds;
    }

    public String getFirstShootingRage() {
        return firstShootingRage;
    }

    public String getSecondShootingRage() {
        return secondShootingRage;
    }

    public String getThirdShootingRange() {
        return thirdShootingRange;
    }

    public int getFinalTimeCalculated() {
        return finalTimeCalculated;
    }


    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResultMinutesSeconds='" + skiTimeResultMinutesSeconds + '\'' +
                ", firstShootingRage='" + firstShootingRage + '\'' +
                ", secondShootingRage='" + secondShootingRage + '\'' +
                ", thirdShootingRange='" + thirdShootingRange + '\'' +
                // aici facem o mica solutie ca sa fie vizibila minute:secunde ca timp in output :)
                ", finalTimeCalculated=" + finalTimeCalculated / 60 + ":" + finalTimeCalculated % 60 +
                '}';
    }
}


// tot ce este mai jos este versiunea 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//
//    // aici trebuie de revizuit ca sa treaca prin lista;
//    public int totalMissing(Athlete athlete) {
//        int missingFirst = (int) athlete.getFirstShootingRage().chars().filter(ch -> (ch == 'o')).count();
//        int missingSecond = (int) athlete.getSecondShootingRage().chars().filter(ch -> (ch == 'o')).count();
//        int missingThird = (int) athlete.getThirdShootingRange().chars().filter(ch -> (ch == 'o')).count();
//        int totalMissing = missingFirst + missingSecond + missingThird;
//        System.out.println("TotalMissing for ID " + athlete.getAthleteNumber() + " is " + totalMissing + " points");
//        return totalMissing;
//    }
//    // aici trebuie de revizuit
//    public int calculatingFinalTime(Athlete skiTimeResultMinutesSeconds) {
//        String[] tokens = this.getSkiTimeResultMinutesSeconds().split(":");
//        if (tokens.length != 2) {
//            throw new IllegalArgumentException();
//        }
//        int minutesConvertToSeconds = (Integer.parseInt(tokens[0].trim()) * 60) + (Integer.parseInt(tokens[1].trim()));
//        System.out.println("Minutes to seconds: " + (Integer.parseInt(tokens[0].trim()) * 60) + " Seconds: " + (Integer.parseInt(tokens[1].trim())));
//        return minutesConvertToSeconds;
//    }
//
//
