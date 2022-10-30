import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // Может устанавливать громкость
    public void currentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Может устанавливать станцию
    public void currentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную громкость
    public void setToMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную станцию
    public void setToMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 больше
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 больше если уже максимум
    public void increaseVolumeIfMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test // Устанавливает станцию на 1 больше
    public void increaseStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.next();
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

        @Test // Устанавливает громкость на 1 меньше
        public void reduceVolume () {
            Radio rad = new Radio();
            rad.setCurrentVolume(9);
            rad.reduceVolume();
            int expected = 8;
            int actual = rad.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

    @Test // Устанавливает станцию на 1 меньше
    public void PrevStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test // Устанавливает станцию на 1 меньше нуля
    public void PrevStation0 () {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 больше 9
    public void PrevStation9 () {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Может устанавливать отрицательную станцию
    public void currentStationLess() {
        Radio rad = new Radio();
        rad.setCurrentStation(-5);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Может устанавливать станцию больше максимальной
    public void currentStationOver() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    }