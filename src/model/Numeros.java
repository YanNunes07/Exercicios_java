package model;

public class Numeros {
    private double valor1, valor2, valor3;

    public Numeros(){

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

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public String mostarNumeros(){
        if (valor1 < valor2 && valor1<valor3){
            return "O menor é valor 1";
        }if (valor2 < valor3 && valor2<valor3){
            return "menor é valor 2";
        }if (valor3<valor1 && valor3<valor2){
            return "menor é valor 3";
        }if (valor1==valor2 && valor1==valor3){
            return "valores iguais";
        }if (valor1==valor2 && valor1!=valor3 && valor3!=valor2){
            return "valor1 é igual a valor2";
        }if (valor1!= valor2 && valor1!=valor3 && valor3==valor2){
            return "valor 3 é igual a valor 2";
        }else{
            return "valor null";
        }
    }

    @Override
    public String toString(){
        return "\nValor 1: "+this.valor1+
                "\nValor2: "+ this.valor2+
                "\nValor 3: "+this.valor3+
                "\nO menor é: "+ this.mostarNumeros();
    }


}
