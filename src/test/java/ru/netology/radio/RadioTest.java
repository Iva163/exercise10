package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(10);

    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationBelowZero() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMaxStation() {

        radio.setCurrentStation(radio.getMaxStation() + 1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationIfCurrentMaxStation() {

        radio.setCurrentStation(radio.getMaxStation());

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {

        radio.prev();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationIfCurrentAboveZero() {

        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {

        for (int i = 0; i < (radio.getMaxVolume() + 1); i++) {
            radio.increaseVolume();
        }

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {

        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }

        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeIfCurrentMin() {

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getAmountStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldSetAmountStation() {
        radio.setAmountStation(10);
        Assertions.assertEquals(10, radio.getAmountStation());

    }

    @Test
    public void shouldSetMaxStation() {
        radio.setMaxStation(10);
        Assertions.assertEquals(10, radio.getMaxStation());

    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxVolume());

    }



    @Test
    public void shouldRadio() {
        Radio radio = new Radio(10, 5, 10, 9, 100);
        Assertions.assertEquals(10, radio.getCurrentVolume());
        Assertions.assertEquals(5, radio.getCurrentStation());
        Assertions.assertEquals(10, radio.getAmountStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
}
