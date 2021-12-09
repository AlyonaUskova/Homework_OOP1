package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    // переключаем канал на следующий
    @Test // среднее значение
    public void shouldIncreaseChannelMiddleValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        assertEquals(5, radio.switchChannelNext());
    }

    @Test // минимальное значение
    public void shouldIncreaseChannelLessValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        assertEquals(1, radio.switchChannelNext());
    }

    @Test // максимальное значение
    public void shouldIncreaseVChannelMoreValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        assertEquals(0, radio.switchChannelNext());
    }

    // переключаем канал на предыдущий
    @Test // среднее значение
    public void shouldDecreaseChannelMiddleValue() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(5);
        assertEquals(4, radio2.switchChannelPrev());
    }
    @Test // среднее значение 2
    public void shouldDecreaseChannelMiddleValue2() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(7);
        assertEquals(6, radio2.switchChannelPrev());
    }
    @Test // минимальное значение
    public void shouldDecreaseChannelLessValue() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(0);
        assertEquals(9, radio2.switchChannelPrev());
    }
    @Test // максимальное значение
    public void shouldDecreaseChannelMoreValue() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(9);
        assertEquals(8, radio2.switchChannelPrev());
    }
    @Test // близко к минимальному значению
    public void shouldDecreaseChannelLessCloseValue() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(1);
        assertEquals(0, radio2.switchChannelPrev());
    }
    @Test // близко к максимальному значению
    public void shouldDecreaseChannelMoreCloseValue() {
        Radio radio2 = new Radio();
        radio2.setCurrentChannel(8);
        assertEquals(7, radio2.switchChannelPrev());
    }

    //делаем звук громче
    @Test // начальная средняя громкость
    public void shouldIncreaseVolumeMiddleValue() {
        Radio radio3 = new Radio();
        radio3.setCurrentVolume(4);
        assertEquals(5, radio3.increaseVolume());
    }
    @Test // начальная минимальная громкость
    public void shouldIncreaseVolumeLessValue() {
        Radio radio3 = new Radio();
        radio3.setCurrentVolume(0);
        assertEquals(1, radio3.increaseVolume());
    }
    @Test // начальная максимальная громкость
    public void shouldIncreaseVolumeMoreValue() {
        Radio radio3 = new Radio();
        radio3.setCurrentVolume(10);
        assertEquals(10, radio3.increaseVolume());
    }
    // делаем звук тише
    @Test // начальная средняя громкость
    public void shouldDecreaseVolumeMiddleValue() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(5);
        assertEquals(4, radio4.decreaseVolume());
    }
    @Test // начальная средняя громкость 2
    public void shouldDecreaseVolumeMiddleValue2() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(7);
        assertEquals(6, radio4.decreaseVolume());
    }
    @Test // начальная минимальная громкость
    public void shouldDecreaseVolumeLessValue() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(0);
        assertEquals(0, radio4.decreaseVolume());
    }
    @Test // начальная максимальная громкость
    public void shouldDecreaseVolumeMoreValue() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(10);
        assertEquals(9, radio4.decreaseVolume());
    }
    @Test // близко к минимальному значению
    public void shouldDecreaseVolumeLessCloseValue() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(1);
        assertEquals(0, radio4.decreaseVolume());
    }
    @Test // близко к максимальному значению
    public void shouldDecreaseVolumeMoreCloseValue() {
        Radio radio4 = new Radio();
        radio4.setCurrentVolume(9);
        assertEquals(8, radio4.decreaseVolume());
    }
    // проверяем геттеры (а надо ли? как от этого избавиться?)
    @Test
    public void shouldUseGetterVolume () {
        Radio radio5 = new Radio();
        radio5.getCurrentVolume();
        assertEquals(0, radio5.getCurrentVolume());
    }
    @Test
    public void shouldUseGetterChannel () {
        Radio radio5 = new Radio();
        radio5.getCurrentChannel();
        assertEquals(0, radio5.getCurrentChannel());
    }
}