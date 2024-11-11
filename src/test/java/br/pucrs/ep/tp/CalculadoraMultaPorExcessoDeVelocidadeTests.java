package br.pucrs.ep.tp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraMultaPorExcessoDeVelocidadeTests {
    
    private CalculadoraMultaPorExcessoDeVelocidade calculadora;

    @BeforeEach
    void setup(){
        calculadora = new CalculadoraMultaPorExcessoDeVelocidade();
    }

    @ParameterizedTest(name = "{0} e {1} = {2}")
    @CsvSource({
        "89.0, 3, 250.0",
        "100.0, 8, 350.0",
        "97.0, 12, 500.0",
        "200, 2, 500.0",
        "183, 6, 700.0",
        "176, 19, 1000.0",

        "80, 5, 0.0",
        "80, 10, 0.0",
        "120, 5, 250.0",
        "120, 10, 350.0",
        "80, 6, 0.0",
        "80, 11, 0.0",
        "120, 6, 350.0",
        "120, 11, 500.0",
        "81, 5, 250.0",
        "81, 10, 350.0",
        "121, 5, 500.0",
        "121, 10, 700.0",
        "81, 6, 350.0",
        "81, 11, 500.0",
        "121, 6, 700.0",
        "121, 11, 1000.0",

    })
    void testCalculaMulta(double velocidade, int tempoDeHabilitação, double multa) {
        assertEquals(multa, calculadora.calculaMulta(velocidade, tempoDeHabilitação), 0.001);
    }
}
