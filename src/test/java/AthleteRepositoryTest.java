import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AthleteRepositoryTest extends TestCase {

    //object under Test>>>>
    AthleteRepository athleteRepository = new AthleteRepository();

    @Test
    public void testCSVInput () {
        //given (ce se da ca conditie de input)
        String inputLine = "1,Abraham Loncoln,UK,25:44,xxoox,xooxo,xxxxo";


        //when (aici e metoda propriu zisa)
        Athlete result = athleteRepository.getAthletesFromCsvLine(inputLine);

        //then
        assert result != null;
        Assert.assertEquals(1,result.getAthleteNumber());
        Assert.assertEquals("Abraham Loncoln",result.getAthleteName());
        Assert.assertEquals("UK",result.getCountryCode());
        Assert.assertEquals("25:44",result.getSkiTimeResultMinutesSeconds());
        Assert.assertEquals("xxoox",result.getFirstShootingRage());
        Assert.assertEquals("xooxo",result.getSecondShootingRage());
        Assert.assertEquals("xxxxo",result.getThirdShootingRange());

    }

    @Test
    public void testCSVInputWithSpaces () {
        //given (ce se da ca conditie de input)
        String inputLine = "1 ,Abraham Loncoln ,UK , 25:44,xxoox,xooxo,xxxxo";


        //when (aici e metoda propriu zisa)
        Athlete result = athleteRepository.getAthletesFromCsvLine(inputLine);

        //then
        assert result != null;
        Assert.assertEquals(1,result.getAthleteNumber());
        Assert.assertEquals("Abraham Loncoln",result.getAthleteName());
        Assert.assertEquals("UK",result.getCountryCode());
        Assert.assertEquals("25:44",result.getSkiTimeResultMinutesSeconds());
        Assert.assertEquals("xxoox",result.getFirstShootingRage());
        Assert.assertEquals("xooxo",result.getSecondShootingRage());
        Assert.assertEquals("xxxxo",result.getThirdShootingRange());

    }


    @Test (expected = IllegalArgumentException.class)
    public void testMalformatedCSVInput () {
        //given (ce se da ca conditie de input)
        String inputLine = "1,,UK,25:44,xxoox,xooxo,xxxxo";


        //when (aici e metoda propriu zisa)
        Athlete result = athleteRepository.getAthletesFromCsvLine(inputLine);

        //then

    }

}