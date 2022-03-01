package model;

public class ParOuImpar {
    private int valor1;

    public ParOuImpar(){

    }

    public int getValor() {
        return valor1;
    }

    public void setValor(int valor) {
        this.valor1 = valor;
    }


    public String testarValor(){
        if ((valor1 % 2 == 0) && (valor1>0)){
            return "o numero é par e possitivo";
        }else if ((valor1 % 2 == 0) && (valor1<0)){
            return "numero é par enegativo";
        }else if ((valor1 % 2 != 0) && (valor1>0)){
            return "o numero é impar e possitivo";
        }else if ((valor1 % 2 != 0) && (valor1<0)){
            return "numero é impar e negativo";
        }else{
            return "o numero é impar";
        }
    }

    @Override
    public String toString(){
        return "\nValor 1 "+valor1+
                "\nO "+testarValor();
    }
}
