package calculadora.menu;
import javax.swing.JOptionPane;

public class Menu {

	public static String menu() {
		String aux = "Escolha a operação: \n";
		aux += "+. Adição\n";
		aux += "-. Subtração\n";
		aux += "*. Multiplicação\n";
		aux += "/. Divizão\n";
		aux += "%. Resto\n";
		aux += "0. Finalizar\n";
	
		return aux;
	}
	
	public static void adicao(Double num1, Double num2) {
		String resultado = String.format("Resultado: %.2f", num1 + num2);
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void subtracao(Double num1, Double num2) {
		String resultado = String.format("Resultado: %.2f", num1 - num2);
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void multiplicacao(Double num1, Double num2) {
		String resultado = String.format("Resultado: %.2f", num1 * num2);
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void divisao(Double num1, Double num2) throws DivisaoInvalidaException{
		
		if(num1 == 0) {
			throw new DivisaoInvalidaException("Não é possível dividir o valor zero");
		}
		
		String resultado = String.format("Resultado: %.2f", num1 / num2);
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static void resto(Double num1, Double num2) {
		String resultado = String.format("Resultado: %.2f", num1 % num2);
		JOptionPane.showMessageDialog(null, resultado);
	}
}
