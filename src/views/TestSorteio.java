package views;

import model.Sorteio;

import java.util.Scanner;

public class TestSorteio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Sorteio s1 = new Sorteio();

        System.out.println("Escolha um nº entre 1 e 3: ");
        s1.numero = ler.nextInt();

        System.out.println("Veja seu prêmio......\nVocê Ganhou..."+s1.sortearPremios());

    }
}
