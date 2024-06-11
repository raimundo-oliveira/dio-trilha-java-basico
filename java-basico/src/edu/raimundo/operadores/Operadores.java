package edu.raimundo.operadores;

public class Operadores {
    public static void main(String[] args) {
        
        /*Quando utiliza o operador + em String,  
        ele tem o papel de concatenação.*/
        String nomeCompleto = "Raimundo " + "Oliveira";
        System.out.println(nomeCompleto);

        /* Operadores Unários
         * (+) operador que indica que o valor é positivo;
         * (-) operador que indica que o valor é negativo;
         * (++) operador que indica o incremento de um valor;
         * (--) operador que indica o decremento de um valor;
         * (!) operador que indica negação;
        */

        // Exemplo de incrementação
        int numero = 5;
        numero++;
        System.out.println(numero);

        // Exemplode negação
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        /* Operadores Ternários
         * Condição ? se verdadeiro : se falso;
         */

        //  Exemplo
        int a, b;
        a = 6;
        b = 6;

        int resultado = a == b? 1 : 0;
        System.out.println(resultado);

        /* Operadores Relacionais
         * (==) verifica se uma variável é igual a outra
         * (!=) verifica se uma variável é diferente da outra
         * (>) verifica se um variável é maior que a outra
         * (>=) verifica se um variável é maior ou igual que a outra
         * (<) verifica se um variável é menor que a outra
         * (<=) verifica se um variável é menor ou igual que a outra
         */

        // Exemplo
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual de numeroDois? " +simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " +simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior de numeroDois? " +simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor de numeroDois? " +simNao);
        
        /* Operadores Lógicos
         * (&&) Operador lógico "E"
         * (||) Operador lógico "OU"
         */
        
        // Exemplo
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras"); 
        }
    }
}
