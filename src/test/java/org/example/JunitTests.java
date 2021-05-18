package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisableIfFriday
class JunitTests {

    @Test
    void simpleTest() {
        assertTrue(true);
    }

}
