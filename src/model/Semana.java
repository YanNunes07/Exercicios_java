package model;

public class Semana {
    public int dia;
    public int mes; // todos os meses que possuem 30 dias

    public String selecionarMes(){
        String quantidade;
        switch (this.mes){
            case 1: case 4: case 6: case 9: case 11:
                quantidade = "Meses que possuem 30 dias";
                break;
            case 3: case 5: case 7: case 8: case 10: case 12:
                quantidade = "Meses que possuem 31 dias";
                break;
            case 2:
                quantidade = "meses que possuem 28 dias";
                break;
            default:
                quantidade = "mes invalido";
                break;
        }
        return quantidade;
    }

    public String escolherDiaDaSemana(){
        String opcao;
        switch (this.dia){
            case 1:
                opcao = "Domingo";
                break;
            case 2:
                opcao = "Segunda-Feira";
                break;
            case 3:
                opcao = "Terça feira";
                break;
            case 4:
                opcao = "Quarta feira";
                break;
            case 5:
                opcao = "Quinta-feira";
                break;
            case 6:
                opcao = "Sexta feira";
                break;
            case 7:
                opcao = "Sabado";
                break;
            default:
                opcao = "dia invalido";
                break;
        }
        return opcao;
    }
}