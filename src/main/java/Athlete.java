public class Athlete {

    int athleteNumber;
    String athleteName;
    String countryCode;
    String skiTimeResultMinutesSeconds;
    String firstShootingRage;
    String secondShootingRage;
    String thirdShootingRange;

    public Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResultMinutesSeconds, String firstShootingRage, String secondShootingRage, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResultMinutesSeconds = skiTimeResultMinutesSeconds;
        this.firstShootingRage = firstShootingRage;
        this.secondShootingRage = secondShootingRage;
        this.thirdShootingRange = thirdShootingRange;
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
                '}';
    }
}
