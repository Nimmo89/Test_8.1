package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void increase1p() {  //Увеличение громкости на 1 пункт
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() - 1);

        rad.increase1p();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decrease1p() {  //Уменьшение громкости на 1 пункт
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume() + 1);

        rad.decrease1p();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverMax() {  //Увеличение громкости сверхмаксимумв на 1
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);

        rad.increase1p();

        int expected = rad.getMaxVolume();
        int actual = rad.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOverMin() {  //Уменьшение громкости смерхминимума на 1
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume() - 1);

        rad.decrease1p();

        int expected = rad.getMinVolume();
        int actual = rad.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        Radio rad = new Radio();
        rad.setCurNumStation(rad.getMaxNumberStation() - 1);

        rad.increaseStation();

        int expected = rad.getMaxNumberStation();
        int actual = rad.getCurNumStation();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStation() {
        Radio rad = new Radio();
        rad.setCurNumStation(rad.getMinNumberStation() + 1);

        rad.decreaseStation();

        int expected = rad.getMinNumberStation();
        int actual = rad.getCurNumStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseStationOverMax() {
        Radio rad = new Radio();
        rad.setCurNumStation(rad.getMaxNumberStation() + 1);

        rad.increaseStation();

        int expected = rad.getMinNumberStation();
        int actual = rad.getCurNumStation() - 1;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationOverMin() {
        Radio rad = new Radio();
        rad.setCurNumStation(rad.getMinNumberStation() - 1);

        rad.decreaseStation();

        int expected = rad.getMaxNumberStation();
        int actual = rad.getCurNumStation() + 1;

        assertEquals(expected, actual);
    }
}