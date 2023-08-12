package com.example;

import com.example.model.Cliente;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");

        Cliente cliente = new Cliente();
        cliente.setRenda(1000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        cliente.setNome("Manoel Campos 😁");
        cliente.setCpf("99999999999");
        cliente.setCidade("Palmas");
        
        var vetorNome = cliente.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);

        System.out.println("1o caractere: " + cliente.getNome().charAt(0));

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());


        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setCidade("PALMAS");
        cliente2.setNome("Manoel");
        cliente2.setCpf("99999999999");
        System.out.println();

        if (cliente.getCidade().equalsIgnoreCase(cliente2.getCidade())) {
            System.out.println("Cliente 1 e Cliente 2 moram na mesma cidade");
        } else {
            System.out.println("Cliente 1 e Cliente 2 moram em cidades diferentes");
        }

        if (cliente.getCpf().equals(cliente2.getCpf())) {
            System.out.println("Cliente 1 e Cliente 2 tem o mesmo CPF");
        } else {
            System.out.println("CPFs são diferentes");
        }


        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());



    }
}
