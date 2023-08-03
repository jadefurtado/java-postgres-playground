package com.example;

public class AppOperadoresRelacionais {
    
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1980);
        
        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1980);

        if(cliente1.getAnoNascimento() > cliente2.getAnoNascimento()){
            System.out.println("O cliente1 é mais jovem que o cliente 2");
        } else if(cliente1.getAnoNascimento() < cliente2.getAnoNascimento()) {
            System.out.println("O cliente 1 é mais velho que o cliente 2");
        }
        else System.out.println("Os clientes têm a mesma idade");
    }
}
