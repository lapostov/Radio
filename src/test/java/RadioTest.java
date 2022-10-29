import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test // Устанавливает громкость на 1 больше при громкости 100
    public void increaseVolumeIfMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 больше
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(85);
        rad.increaseVolume();
        int expected = 86;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше
    public void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(76);
        rad.reduceVolume();
        int expected = 75;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше, если громкость 100
    public void reduceVolumeIfMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.reduceVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше, если громкость 0
    public void reduceVolumeIfMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше, если громкость 0
    public void reduceVolumeIfNegative() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость больше 100
    public void reduceVolumeIfOver() {
        Radio rad = new Radio();
        rad.setCurrentVolume(105);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @org.junit.Test // Устанавливает станцию на 1 больше
    public void NextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию на 1 больше c последней
    public void increaseStationLast() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию на 1 меньше c первой станции
    public void reduceStationIfFirst() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.reduceStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает любую станцию
    public void SetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию на 1 меньше при нулевой станции
    public void reduceStationIfMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.reduceStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию на 1 меньше
    public void reduceStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.reduceStation();
        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию на 1 больше если станция больше 9
    public void NextStationIfOver() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает любую станцию
    public void SetStationLessThen0() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.Test // Устанавливает 0 станцию
    public void SetStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        int expected = 15;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает 9 станцию
    public void SetStation9() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает станцию 0
    public void SetStationZir() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.Test // Устанавливает станцию на 1 больше если станция больше 9
    public void NextStationIfMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // Устанавливает 0трицательную станцию
    public void SetNegative() {
        Radio rad = new Radio();
        rad.setCurrentStation(-5);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}





