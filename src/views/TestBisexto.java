package views;

import model.Bisexto;

import java.util.Scanner;

public class TestBisexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Bisexto bisexto = new Bisexto();

        System.out.println("Digite um ano");
        bisexto.ano = ler.nextInt();

        if (bisexto.ano %4 == 0){
            System.out.println(bisexto);
            System.out.println("Este ano é bisexto");
        }else{
            System.out.println(bisexto);
            System.out.println("Esse ano não é bisexto");
        }
    }
}
