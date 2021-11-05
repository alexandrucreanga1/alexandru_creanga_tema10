import org.junit.Test;

public class AthleteTest {

    //object under Test>>>>
    Athlete athlete = new Athlete();



    @Test (expected = IllegalArgumentException.class)
    public void testWrongCharactersPointing () {
        //given (ce se da ca conditie de input)
        String inputLine1 = "xyoox";
        String inputLine2 = "xxooz";
        String inputLine3 = "xxoox";


        //when (aici e metoda propriu zisa)
        int result = athlete.calculatePenaltyInSeconds(inputLine1,inputLine2,inputLine3);

    }


    @Test (expected = IllegalArgumentException.class)
    public void testIncompleteNumberOfPointsPerShooting () {
        //given (ce se da ca conditie de input)
        String inputLine1 = "xooox";
        String inputLine2 = "xxoo";
        String inputLine3 = "xxoox";


        //when (aici e metoda propriu zisa)
        int result = athlete.calculatePenaltyInSeconds(inputLine1,inputLine2,inputLine3);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testNumberSetForSeconds () {
        //given (ce se da ca conditie de input)
        String inputLine1 = "61";

        //when (aici e metoda propriu zisa)
        int result = athlete.parsingfromStringToInt(inputLine1);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testFormatTimeString () {
        //given (ce se da ca conditie de input)
        String inputLine1 = "59:61:34";

        //when (aici e metoda propriu zisa)
        int result = athlete.parsingfromStringToInt(inputLine1);

    }



}