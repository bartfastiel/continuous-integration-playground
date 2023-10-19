package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void expect42_whenSumming40And2() {
        int a = 40;
        int b = 2;

        int actual = Main.sum(a, b);

        assertEquals(42, actual);
    }

}