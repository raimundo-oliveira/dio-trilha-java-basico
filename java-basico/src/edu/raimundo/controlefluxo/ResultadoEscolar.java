package edu.raimundo.controlefluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        // Controle de fluxo de condicional composta
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        
        else
            System.out.println("Reprovado");

        // Controle de fluxo de condicional encadeada
        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");
        
        else
            System.out.println("Reprovado");

        // Controle de fluxo de condicional ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado"; 
        System.out.println(resultado);
    }
}
