import org.junit.Assert;
import org.junit.Test;

public class RadioTest {
    @Test
    public void turnOnAboveStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnNormalStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryStationMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryStationPlusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryStationMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryStationPlusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnAboveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnNormalVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryVolumeMinusOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMinBoundaryVolumePlusOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryVolumeMinusOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void turnOnMaxBoundaryVolumePlusOne() {

        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeStationMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeStationAboutLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeBackStationNormal() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeBackStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAbutLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assert.assertEquals(expected, actual);
    }
}
