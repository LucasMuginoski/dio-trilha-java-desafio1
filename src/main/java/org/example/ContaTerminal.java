package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular dessa conta! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta "+ numero +
                " e seu saldo " + saldo +
                " já está disponível para saque"
        );
        scanner.close();
    }
}