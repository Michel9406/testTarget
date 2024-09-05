package testeFibocci;

import java.util.Scanner;

public class VerificarString {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contagem = 0;

     
        for (char letra : frase.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contagem++;
            }
        }

       
        if (contagem > 0) {
            System.out.println("A letra 'a' aparece " + contagem + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }

        scanner.close();
    }
}