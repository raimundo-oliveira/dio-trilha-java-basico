package edu.raimundo.controlefluxo.estruturacondicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        // Controle de fluxo de condicional simples
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
            
        System.out.println(saldo);

        // Controle de fluxo de condicional composta
        double saldo2 = 18.0;
        double valorSolicitado2 = 20.0;

        if(valorSolicitado2 < saldo2){
            saldo2 = saldo2 - valorSolicitado2;
            System.out.println("Novo saldo: " +saldo2);
        }
        else 
            System.out.println("Saldo insuficiente");
    }
}