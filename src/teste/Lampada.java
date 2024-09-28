package teste;

public class Lampada {

	public static void main(String[] args) {

		boolean interruptor1 = false;
		boolean interruptor2 = false;
		boolean interruptor3 = false;

		interruptor1 = true;
		esperar(2);

		interruptor1 = false;
		interruptor2 = true;

		verificarLampadas(interruptor1, interruptor2, interruptor3);
	}

	private static void esperar(int minutos) {
		System.out.println("Aguardando por " + minutos + " minutos...");

	}

	private static void verificarLampadas(boolean inter1, boolean inter2, boolean inter3) {

		boolean lampada1Quente = true;

		boolean lampada2Acesa = inter2;

		boolean lampada3Apagada = !inter3;

		if (lampada2Acesa) {
			System.out.println("Interruptor 2 controla a lâmpada acesa");
		}

		if (lampada1Quente) {
			System.out.println("Interruptor 1 controla a lâmpada que está quente");
		}

		if (lampada3Apagada) {
			System.out.println("Interruptor 3 controla a lâmpada apagada");
		}
	}
}