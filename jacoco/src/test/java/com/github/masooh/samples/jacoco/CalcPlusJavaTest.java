package com.github.masooh.samples.jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcPlusJavaTest {
    @Test
    public void add() throws Exception {
        Calc calc = new Calc();
        int sum = calc.plus(3, 5);
        assertEquals(8, sum);
    }

}