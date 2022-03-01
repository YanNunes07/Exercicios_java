package views;

import model.Semana;

import java.util.Scanner;

public class TestSem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Semana sm = new Semana();

        System.out.println("Digite o mes e veja a quantidade em dias");
        sm.mes = ler.nextInt();

        System.out.println("Digite o num correspondente ao dia da semana");
        sm.dia = ler.nextInt();
        System.out.println(sm.selecionarMes());
        System.out.println(sm.escolherDiaDaSemana());

    }
}
