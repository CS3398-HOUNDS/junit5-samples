/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

    @Test
    @DisplayName("2 - 3 = -1")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3), "2 - 3 should equal -1");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
			"1,    1,   0",
			"1,    2,   -1",
			"49,  51,   -2",
			"1,  100, -99"
    })

    void subtract(int minuend, int subtrahend, int difference) {
        Calculator calculator = new Calculator();
        assertEquals(difference, calculator.subtract(minuend, subtrahend),
                () -> minuend + " - " + subtrahend + " should equal " + difference);
    }

    @Test
    @DisplayName("5 - 3 = 2")
    void subtractTwoNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
			"1,    1,   0",
			"1,    -2,   3",
			"50,  -40,   90",
			"100, 1 , 99"
    })

    void subtract2(int minuend, int subtrahend, int difference) {
        Calculator calculator = new Calculator();
        assertEquals(difference, calculator.subtract(minuend, subtrahend),
                () -> minuend + " - " + subtrahend + " should equal " + difference);
    }

}
