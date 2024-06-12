package edu.raimundo.estruturarepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        
        // Exemplo de For simples
        for(int carneirinhos = 1; carneirinhos <= 5; carneirinhos++){
            System.out.println("Contando carneirinhos " +carneirinhos);
        }

        // Exemplo de For em Arrays
        String alunos[] = {"Raimundo", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = "+x+" é "+alunos[x]);
        }

        // Exemplo for each
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " +aluno);
        }
    }
}
