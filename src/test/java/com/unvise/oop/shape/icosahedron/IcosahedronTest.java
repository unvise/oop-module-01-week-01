package com.unvise.oop.shape.icosahedron;

import com.unvise.oop.Icosahedron;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcosahedronTest {

    @Test
    @DisplayName("Verify that icosahedron volume is computed correctly even when no fin length is specified")
    public void icosahedronVolume_whenFinLengthIsNotGiven() {
        // given
        Double icosahedronVolume = Icosahedron.volume(0d);
        // then
        assertEquals(0, icosahedronVolume);
    }

    @Test
    @DisplayName("Verify that icosahedron volume is computed correctly")
    public void icosahedronVolumeTest() {
        // given
        Double icosahedronVolume = Icosahedron.volume(2d);
        // then
        assertEquals(17.4535, icosahedronVolume, 0.0001);
    }

}