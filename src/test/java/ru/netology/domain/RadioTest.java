package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rad = new Radio();
    Radio rad1 = new Radio(74);
    Radio rad2 = new Radio(44);
    Radio rad3 = new Radio(5);
    @Test
    public void increase1p() {  //Увеличение громкости на 1 пункт
        rad.setCurrentVolume(rad.getMaxVolume() - 1);

        rad.increase1p();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }  //Увеличение громкости на 1

    @Test
    public void decrease1p() {  //Уменьшение громкости на 1 пункт
        rad.setCurrentVolume(rad.getMinVolume() + 1);

        rad.decrease1p();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }  //Снижение громкости на 1

    @Test
    public void increaseVolumeOverMax() {  //Увеличение громкости сверхмаксимумв на 1
        rad.setCurrentVolume(rad.getMaxVolume());

        rad.increase1p();

        int expected = rad.getMaxVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOverMin() {  //Уменьшение громкости смерхминимума на 1
        rad.setCurrentVolume(rad.getMinVolume());

        rad.decrease1p();

        int expected = rad.getMinVolume();
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        rad1.setCurNumStation(rad1.getMaxNumberStation() - 1);

        rad1.increaseStation();

        int expected = rad1.getMaxNumberStation();
        int actual = rad1.getCurNumStation();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStation() {
        rad3.setCurNumStation(rad3.getMinNumberStation() + 1);

        rad3.decreaseStation();

        int expected = rad3.getMinNumberStation();
        int actual = rad3.getCurNumStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseStationOverMax() {
        rad2.setCurNumStation(rad2.getMaxNumberStation());

        rad2.increaseStation();

        int expected = rad2.getMinNumberStation();
        int actual = rad2.getCurNumStation();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationOverMin() {
        rad.setCurNumStation(rad.getMinNumberStation());

        rad.decreaseStation();

        int expected = rad.getMaxNumberStation();
        int actual = rad.getCurNumStation();

        assertEquals(expected, actual);
    }
}