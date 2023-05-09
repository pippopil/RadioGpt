package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();
        assertEquals(1, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(15);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(0);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        assertEquals(5, radio.getVolume());
        radio.setVolume(8);
        assertEquals(8, radio.getVolume());
        radio.setVolume(15);
        assertEquals(8, radio.getVolume());
        radio.setVolume(0);
        assertEquals(8, radio.getVolume());
    }

    @Test
    public void testSaveStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.saveStation(4);
        radio.setCurrentStation(2);
        radio.saveStation(2);
        radio.selectStation(4);
        assertEquals(7, radio.getCurrentStation());
        radio.selectStation(2);
        assertEquals(2, radio.getCurrentStation());
        radio.selectStation(6);
        assertEquals(2, radio.getCurrentStation());
        radio.selectStation(0);
        assertEquals(2, radio.getCurrentStation());
    }
}