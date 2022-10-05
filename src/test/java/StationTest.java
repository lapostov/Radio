import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StationTest {

    @Test // Должен устанавливать станцию
    public void ShouldSetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную станцию
    public void setToMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 больше
    public void increaseStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.next();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 меньше
    public void reduceStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.reduceStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает нужную радиостанцию
    public void ShouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        int expected = 2;
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

