package calculadora.principal;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;



import java.util.List;

import calculadora.menu.DivisaoInvalidaException;
import calculadora.menu.Menu;

// Character.getNumericValue('0') c o char em numerico
// Integer.parseInt sṕ funciona para string

public class Principal {
	public static void main(String[] args) throws OpcaoInvalidaException {
		char opcao = 1;
		
		List<Character> listOptions = List.of('+', '-', '*', '/', '%', '0');
		
		do {			
			
			try {
				opcao = showInputDialog(Menu.menu()).toCharArray()[0];	
				
				
				Boolean isOpcaoValida = listOptions.contains(opcao);
				if(!isOpcaoValida) {
					throw new OpcaoInvalidaException("Digite uma opção valida");
				} else if(opcao != '0'){
					Double num1 = Double.parseDouble(showInputDialog("Digite um valor"));
					Double num2 = Double.parseDouble(showInputDialog("Digite outro valor"));
					
					switch (opcao) {
						case '+':
							Menu.adicao(num1, num2);
							break;
						case '-':
							Menu.subtracao(num1, num2);
							break;
						case '*':
							Menu.multiplicacao(num1, num2);
							break;
						case '/':
							Menu.divisao(num1, num2);
							break;
						case '%':
							Menu.resto(num1, num2);
							break;
					}
				}
				
			} catch (NumberFormatException e) {
				showMessageDialog(null, e.getMessage());
			}catch (DivisaoInvalidaException e) {
				showMessageDialog(null, e.getMessage());
			}catch (OpcaoInvalidaException e) {
				showMessageDialog(null, e.getMessage());
			}
			
			
			
		} while (opcao != '0');
	}
}
