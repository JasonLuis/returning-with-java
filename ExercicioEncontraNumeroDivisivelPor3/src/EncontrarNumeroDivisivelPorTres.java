import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EncontrarNumeroDivisivelPorTres {
	
	public static void main(String[] args) {
		Integer[] numeros = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		List<Integer> numerosDivisiveisPorTres = Arrays.stream(numeros)
													   .filter(val -> val % 3 == 0) // Exemplo de função lambda em Java
													   .toList(); // ou .collect(Collectors.toList())
		
		
		System.out.println("Numeros divisiveis por 3: " + numerosDivisiveisPorTres);
						
	}
}