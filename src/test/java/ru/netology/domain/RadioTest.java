package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void switchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        ;
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifStationNumberNine() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        ;
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        ;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        ;
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifStationNumberZero() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        ;
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        ;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifStationNumberGreaterThanNine() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeGreaterThanTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Stations() {
        Radio radio = new Radio(15);
        radio.setCurrentNumberStation(11);
        int expected = 11;
        int actual = radio.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);


    }


}
