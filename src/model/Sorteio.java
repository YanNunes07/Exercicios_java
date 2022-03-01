package model;

public class Sorteio {
    public int numero;

    public String sortearPremios(){
        String premio;
        switch (this.numero){
            case 1:
                premio = "bone high ";
                break;
            case 2:
                premio = "camisa high";
                break;
            case 3:
                premio = "adesivo high";
                break;
            default:
                premio = "opcao invalida;";
        }
        return premio;
    }
}
