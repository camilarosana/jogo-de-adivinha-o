import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(100) + 1;
		int guess;
		
		System.out.println("Bem-vindo ao jogo de Adivinhação!");
		System.out.println("Foi gerado um número aleatório entre 1 e 100. Tente adivinhar!");
		
		do {
			System.out.println("Qual seu chute? ");
			guess = sc.nextInt();
			
			if (guess < secretNumber) {
				System.out.println("Muito baixo! Tente novamente.");
			} else if (guess > secretNumber) {
				System.out.println("Muito alto! Tente novamente.");
			}
			
		} while (guess != secretNumber);
		
		System.out.println("Parabéns! Você ganhou o jogo!");
		
		sc.close();
	}
	
}
