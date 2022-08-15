import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StationTest {

    @Test // Может устанавливать громкость
    public void ShouldSetStation() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает максимальную станцию
    public void setToMaxStation() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает станцию на 1 больше
    public void increaseStation() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.increaseStation();
        int expected = 0;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает громкость на 1 меньше
    public void reduceStation() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.reduceStation();
        int expected = 8;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test // Устанавливает нужную радиостанцию
    public void ShouldSetCurrentStation() {
        RadioVolumeStation rad = new RadioVolumeStation();
        rad.setCurrentStation(1);
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
