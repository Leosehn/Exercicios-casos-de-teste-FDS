package br.pucrs.ep.tp;

/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FincionarioTests {

	@ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
			"5000.00,	225.00",
			"4500.00,   202.5",
			"6000.00,	0.0",
			"2000.00,   90.00",
			"2500.95,	112.54275"
	})
 	void calculaINSS(double first, double expectedResult) {
		Funcionario funcionario = new Funcionario(first);
		assertEquals(expectedResult, funcionario.getINSS(),0.0000001,
				() -> first  + " should equal " + expectedResult);
	}

	@ParameterizedTest(name = "{0} = {1}")
	@CsvSource({
			"1000.00,	0.00",
			"2500.00,	0.00",
			"2600.00,	12.0",
			"3000.00,	60.0",
			"3500.00,	120.0",
			"4900.93,	288.1116",
			"10000.00,	900.00"
	})
	void calculaIRPF(double first, double expectedResult) {
		Funcionario funcionario = new Funcionario(first);
		assertEquals(expectedResult, funcionario.getIRPF(), 0.00000001,
				() -> first + " should equal " + expectedResult);
	}

	@ParameterizedTest(name = "{0}, {1}")
    @CsvSource({
        "2500.0, 2387.5",
        "5000.0, 4475.0",
        "2501.0, 2388.335",
        "5001.0, 4700.88"
    })
    void testGetSalarioLiquido(double salarioBruto, double salarioLiquido) {
        Funcionario funcionario = new Funcionario(salarioBruto);
        assertEquals(salarioLiquido, funcionario.getSalarioLiquido(), 0.001);
    }
}