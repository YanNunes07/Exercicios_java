package model;

public class Operacao {
    private double valor1, valor2;

    public Operacao(){

    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double somoDosValores(){
        return this.valor1+this.valor2;
    }

    public String soma(){
        if (this.somoDosValores()>10){
            return "Numero maior que 10.";
        }else{
            return "Numero menor que 10";
        }
    }

    @Override
    public String toString() {
        return "\nSoma dos valores:" + this.somoDosValores() +
                "\nResultado: " + this.soma();
    }
}
