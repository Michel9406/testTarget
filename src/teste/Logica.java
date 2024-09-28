package teste;

public class Logica {

	public static void main(String[] args) {
	
	
        System.out.println("Sequência A:");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    
        System.out.println("Sequência B:");
        int numero = 2;
        for (int i = 0; i < 7; i++) {
            System.out.print(numero + " ");
            numero *= 2;
        }
        System.out.println("\n");

       
        System.out.println("Sequência C:");
        for (int i = 0; i <= 7; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n");

        
        System.out.println("Sequência D:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n");

       
        System.out.println("Sequência E:");
        int anterior = 1, atual = 1;
        System.out.print(anterior + " " + atual + " ");
        for (int i = 0; i < 5; i++) {
            int proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
        System.out.println("\n");

       
        System.out.println("Sequência F:");
        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        for (int num : sequenciaF) {
            System.out.print(num + " ");
        }
        System.out.print(20);
    }
}