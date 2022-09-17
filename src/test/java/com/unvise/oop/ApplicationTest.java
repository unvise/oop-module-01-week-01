package com.unvise.oop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {
    private static final PrintStream ORIGIN_OUT = System.out;
    private static final ByteArrayOutputStream OUTPUT_STREAM = new ByteArrayOutputStream();
    private static final PrintStream TEST_OUT = new PrintStream(OUTPUT_STREAM);

    @BeforeAll
    public static void setOut() {
        System.setOut(TEST_OUT);
    }

    @Test
    @DisplayName("Verify that out working correctly")
    public void outTest() {
        // given
        String name = "user";
        String output = String.format("Hello, %s", name);

        // when
        System.out.print(output);

        // then
        assertEquals(output, OUTPUT_STREAM.toString().trim());
    }

    @AfterAll
    public static void unsetOut() {
        System.setOut(ORIGIN_OUT);
    }
}