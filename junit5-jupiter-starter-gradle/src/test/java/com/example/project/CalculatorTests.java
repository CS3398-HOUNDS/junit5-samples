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
	@DisplayName("3 - 2 = 1")
	void subTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.sub(3, 2), "3 - 2 should equal 1");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"1,    1,   0",
			"3,    2,   1",
			"52,  51, 1",
			"100,  1, 99"
	})
	void sub(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}

    @Test
	@DisplayName("8 - 4 = 4")
	void sub1TwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.sub(8, 4), "8 - 4 should equal 4");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"5,    1,   4",
			"2,    1,   1",
			"60,  51, 9",
			"30,  10, 20"
	})
	void sub1(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}
}
