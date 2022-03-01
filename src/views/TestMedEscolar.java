package views;

import model.MediaEscolar;

import java.util.Scanner;

public class TestMedEscolar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        MediaEscolar me = new MediaEscolar();

        System.out.println("Digite seu nome");
        me.nome = ler.nextLine();
        System.out.println("Digite seu ra");
        me.ra = ler.nextInt();
        System.out.println("Digite a nota1");
        me.nota1 = ler.nextDouble();
        System.out.println("Digite a nota2");
        me.nota2 = ler.nextDouble();
        System.out.println("Digite a frequencia");
        me.frequencia = ler.nextDouble();

        System.out.println(me);

    }
}
