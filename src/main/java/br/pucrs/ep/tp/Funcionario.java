package br.pucrs.ep.tp;

public class Funcionario {
    double salarioBruto;
    public Funcionario(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }
    public double getINSS(){
        double inss = 0.0;
        if (salarioBruto <= 5000.0) {
            inss = salarioBruto * 0.045;
        }
        return inss;
    }
    public double getIRPF(){
        double imposto_de_renda = 0.0;
        if (salarioBruto > 2500.0) {
            imposto_de_renda = (salarioBruto - 2500.0) * 0.12;
        }
        return imposto_de_renda;
    }
    public double getSalarioLiquido(){
        return salarioBruto - getINSS() - getIRPF();
    }
}