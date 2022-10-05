import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StationTest {

    @Test // Устанавливает станцию на 1 больше
    public void increaseStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.next();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 больше c последней
    public void increaseStationLast() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 меньше c первой станции
    public void reduceStationIfFirst() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.reduceStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



        @Test // Станция 15
        public void ShouldSetFifteen() {
            Radio rad = new Radio();
            rad.setCurrentStation(15);
            int expected = 15;
            int actual = rad.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
    }

