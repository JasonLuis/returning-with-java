import java.util.Scanner;

public class CalcularIndiceMassaCorporal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double resultado = peso / (altura * 2.0);
		
		System.out.println("resultado: " + resultado);
		
		scanner.close();
	}
}