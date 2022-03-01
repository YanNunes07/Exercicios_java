package views;

import model.ContaDeAgua;

import java.util.Scanner;

public class TestContaDeAgua {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaDeAgua ca = new ContaDeAgua();

        System.out.println("Digite a area");
        ca.valorDoConsumo = ler.nextDouble();

        System.out.println("valor do juros é R$"+ca.calcularTarEsg() );
        System.out.println("valor total é R$"+ca.calcularJurosTotal());
    }
}
