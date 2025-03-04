package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeClinete = "";
        double saldo = 0.00;

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular dessa conta! ");
        nomeClinete = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeClinete +
                ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta "+ numero +
                " e seu saldo " + saldo +
                " já está disponível para saque"
        );
        scanner.close();
    }
}