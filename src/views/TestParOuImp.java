package views;

import model.ParOuImpar;

import java.util.Scanner;

public class TestParOuImp {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ParOuImpar pi = new ParOuImpar();

        System.out.println("Digite o numero");
        pi.setValor(ler.nextInt());

        System.out.println(pi);
    }
}
