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
	@DisplayName("Larger minus smaller = positive")
	void subtractsSmallerFromLarger() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.sub(5, 2), "5 - 2 should equal 3");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"2,    1,   1",
			"3,    2,   1",
			"42,  34, 8",
			"9999,  100, 9899"
	})

	void sub(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}

	@Test
	@DisplayName("Smaller minus larger = negative")
	void subtractsLargerFromSmaller() {
		Calculator calculator = new Calculator();
		assertEquals(-2, calculator.sub(1, 3), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"1,    2,   -1",
			"2,    3,   -1",
			"34,  42, -8",
			"100,  9999, -9899"
	})

	void testsub(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}
}
