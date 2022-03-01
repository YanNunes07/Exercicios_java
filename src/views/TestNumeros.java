package views;

import model.Numeros;

import java.util.Scanner;

public class TestNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numeros num = new Numeros();

        System.out.println("Digite o valor1");
        num.setValor1(ler.nextDouble());

        System.out.println("Digite o valor2");
        num.setValor2(ler.nextDouble());

        System.out.println("Digite o valor3");
        num.setValor3(ler.nextDouble());

        System.out.println(num.toString());
    }
}
