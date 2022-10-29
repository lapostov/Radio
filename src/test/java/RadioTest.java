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
        rad.setCurrentVolume(58);
        rad.increaseVolume();
        int expected = 59;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше
    public void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(58);
        rad.reduceVolume();
        int expected = 57;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость 10 при 10
    public void setAddAtMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}
