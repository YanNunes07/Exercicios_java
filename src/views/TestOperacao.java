package views;

import model.Operacao;

import java.util.Scanner;

public class TestOperacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Operacao op = new Operacao();

        String senha1, senha2;

        System.out.println("Cadastre uma senha");
        senha1 = ler.nextLine();


        System.out.println("Digite o valor1");
        op.setValor1(ler.nextDouble());

        System.out.println("Digite o valor2");
        op.setValor2(ler.nextDouble());

        System.out.println(op);

        System.out.println("Repita sua senha");
        ler.nextLine();
        senha2 = ler.nextLine();

        if (senha1.equals(senha2)){
            System.out.println("Senha correta");
        }else{System.out.println("Senha incorreta");
        }
    }

}
