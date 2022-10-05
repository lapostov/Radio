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
        rad.setCurrentVolume(0);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    }
