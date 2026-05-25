import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCadastrandoTarefasDoDia {
	
	public static void main(String[] args) {
		
		String[] tarefas = new String[5];
		
		Integer aux = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cadastre 5 tarefas");
		
		System.out.println(tarefas.length);
		
		while(aux < tarefas.length) {
			String tarefa = scanner.nextLine(); /* Se usar next() ele lê a entrada do teclado apenas até
			encontrar o primeiro espaço em branco */ 
			tarefas[aux] = tarefa;
			
			++aux;
		}
		
		System.out.println(Arrays.toString(tarefas)); // Arrays.toString para conseguir ler todos os cadastros do vetor de string
		scanner.close();
	}
	
}