package br.pucrs.ep.tp;

public class CalculadoraMultaPorExcessoDeVelocidade {
    
    public double calculaMulta(double velocidade, int tempoDeHabilitação){
        if (velocidade <= 80){
            return 0.0;
        }
        else if (velocidade <= 120){
            if (tempoDeHabilitação <= 5){
                return 250.0;
            }
            else if (tempoDeHabilitação <= 10){
                return 350.0;
            }
            else return 500.0;
        }
        else{
            if (tempoDeHabilitação <= 5){
                return 500.0;
            }
            else if (tempoDeHabilitação <= 10){
                return 700.0;
            }
            else return 1000.0;
        }
    }

}
