package testeFibocci;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indice = 12;
		int SOMA = 0;
		int K = 1;

	     while (K < indice) {
	            K = K + 1;
	            SOMA = SOMA + K;
	        }

	        System.out.println("O valor da variável SOMA é: " + SOMA);
	    }
	}