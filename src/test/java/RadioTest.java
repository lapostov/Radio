import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // Может устанавливать громкость
    public void currentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную громкость
    public void setToMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 больше
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.increaseVolume();
        int expected = 7;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше
    public void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает минимальную громкость
    public void setAddAtMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setMinVolume();
        int expected = 0;
        int actual = rad.setMinVolume();
        Assertions.assertEquals(expected, actual);

    }
}
