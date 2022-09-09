package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }
    @Test
        public void shouldMultiplicationPositives(){
        assertEquals(6, calc.multiplication(3,2));
        assertEquals(12, calc.multiplication(4,3));
        assertEquals(16, calc.multiplication(8,2));
        }

    @Test
        public void shouldMultiplicationNegatives() {
            assertEquals(36,calc.multiplication(-6,-6));
            assertEquals(54,calc.multiplication(-9,-6));
            assertEquals(100,calc.multiplication(-5,-20));
        }
    @Test
        public void shouldMultiplicationPosAndNeg() {
            assertEquals(-256, calc.multiplication(-32,8));
            assertEquals(-384, calc.multiplication(-64,6));
            assertEquals(-125, calc.multiplication(-25,5));
        }

    @Test
        public void shouldMultiplicationZero() {
            assertEquals(0, calc.multiplication(30, 0));
            assertEquals(0, calc.multiplication(20, 0));
            assertEquals(0, calc.multiplication(10, 0));
        }
    @Test
        public void shouldAdditionPositives() {

            assertEquals(29, calc.add(13, 16));
            assertEquals(50, calc.add(25, 25));
            assertEquals(250, calc.add(105, 145));
        }
    @Test
        public void shouldAdditionNegative() {
            assertEquals(-24, calc.add(-32, 8));
            assertEquals(-58, calc.add(-64, 6));
            assertEquals(-75, calc.add(25, -100));
        }
    @Test
        public void shouldAdditionPosAndNeg() {

            assertEquals(50, calc.add(-50, 100));
            assertEquals(-30, calc.add(35, -65));
            assertEquals(-75, calc.add(-85, 10));
        }
    @Test
        public void shouldAdditionZero() {

            assertEquals(0, calc.add(-4,4));
            assertEquals(0, calc.add(-9, 9));
            assertEquals(0, calc.add(-25,25));

    }
    @Test
        public void shouldSubtractionPositives() {

            assertEquals(5, calc.subtraction(10,5));
            assertEquals(12, calc.subtraction(24,12));
            assertEquals(7, calc.subtraction(9,2));
            }

    @Test
        public void shouldSubtractionNegative() {
            assertEquals(4, calc.subtraction(-12,-16 ));
            assertEquals(2, calc.subtraction(-13,-15 ));
            assertEquals(3, calc.subtraction(-19,-22));
            }

    @Test
       public void shouldSubtractionPosAndNeg() {
            assertEquals(19, calc.subtraction(10,-9));
            assertEquals(42, calc.subtraction(30,-12));
            assertEquals(40, calc.subtraction(10,-30));
        }

    @Test
        public void shouldSubtractionZero() {
            assertEquals(0, calc.subtraction(20, 20));
            assertEquals(0, calc.subtraction(40, 40));
            assertEquals(0, calc.subtraction(400, 400));
        }


}
