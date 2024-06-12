package edu.raimundo.controlefluxo.estruturaexcepicional;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{
        
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Informe seu nome: ");
            String nome = scanner.next();

            System.out.println("Informe seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("Informe sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();

        }
        catch(InputMismatchException e){
            System.err.println("Os campos de idade e altura precisam ser numéricos!");
        }

        
    }
    

    
}
