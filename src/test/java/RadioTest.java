import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test // Может устанавливать громкость
    public void currentVolume() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.currentVolume = 5;
        int expected = 5;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную громкость
    public void setToMaxVolume() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setToMaxVolume();
        int expected = 10;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 больше
    public void increaseVolume() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.increaseVolume();
        int expected = 7;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше
    public void reduceVolume() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.reduceVolume();
        int expected = 9;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость 10 при 10
    public void setAddAtMax() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setAddAtMax();
        int expected = 10;
        int actual = rad.setAddAtMax();
        Assertions.assertEquals(expected, actual);

    }

    @Test // Устанавливает громкость 10 при 10
    public void setAddAtMin() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setAddAtMin();
        int expected = 0;
        int actual = rad.setAddAtMin();
        Assertions.assertEquals(expected, actual);

    }
}
