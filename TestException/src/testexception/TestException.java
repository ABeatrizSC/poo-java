package testexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        
        try {
            int numero = entrada.nextInt();
            System.out.println("Você digitou o numero " + numero);
            
        } catch (InputMismatchException e){
            System.out.println("ERRO!");
            
        }
        
    }
    
}
