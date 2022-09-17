package com.unvise.oop.shape.icosahedron;

import com.unvise.oop.shape.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcosahedronTest {

    @Test
    @DisplayName("Verify that icosahedron volume is computed correctly even when no fin length is specified")
    public void icosahedronVolume_whenFinLengthIsNotGiven() {
        // given
        Shape icosahedron = Icosahedron.builder()
                .build();

        // when
        Double volume = icosahedron.volume();

        // then
        assertEquals(0, volume);
    }

    @Test
    @DisplayName("Verify that icosahedron volume is computed correctly")
    public void icosahedronVolumeTest() {
        // given
        Shape icosahedron = Icosahedron.builder()
                .finLength(2d)
                .build();

        // when
        Double volume = icosahedron.volume();

        // then
        assertEquals(17.4535, volume, 0.0001);
    }

}