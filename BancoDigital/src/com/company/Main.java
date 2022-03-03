package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean criarConta = false;
        boolean fecharMenu;

        Cliente titular = new Cliente();
        System.out.println("Deseja criar uma conta? 1 = SIM, 2 = NÃO");
        int criar = scan.nextInt();
        int depositar;
        String nomeCliente;
                while (criar == 1) {
                    System.out.println("Digite seu Nome: ");
                    nomeCliente = scan.next();
                    titular.setNome(nomeCliente);
                    Conta cc = new ContaCorrente(titular);
                    Conta poupanca = new ContaPoupanca(titular);
                    double deposito;
                    System.out.println("Deseja depositar na conta Corrente? 1 - SIM, 2 - NÃO");
                    depositar = scan.nextInt();
                    if (depositar == 1) {
                        deposito = scan.nextDouble();
                        cc.depositar(deposito);
                    }
                    cc.imprimirExtrato();

                    poupanca.imprimirExtrato();



                    System.out.println("Deseja fazer outro cadastro? ");
                        criar = scan.nextInt();
                }

        }

    }



