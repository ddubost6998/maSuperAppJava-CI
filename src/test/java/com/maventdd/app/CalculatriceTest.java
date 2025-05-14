package com.maventdd.app; // Assure-toi que le package est correct

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    @Test
    public void testAdditionner() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.additionner(2, 3));
    }
}
