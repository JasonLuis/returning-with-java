public class TiposNumericos {
	public static void main(String[] args) {
		Byte numeroByte = 1; // -128 até 127
		
		Short numeroShort = 1; // -32768 até 32767
		
		Integer numeroInteger = 2147483647; // -2147483648 até 2147483647;
		
		Long numeroLong = 1L; // -9,223372037×10¹⁸ até 9,223372037×10¹⁸ // Precisa colocar 'L' ao lado do numero para identificação de numero Long para o compilador
		
		Float numeroFloat = 1.0f; // Necessario colocar f ao lado do numero para o compilador identificar a tipagem float 
		
		Double numeroDouble = 1.0; // Sempre é mais facil utilizar a tipagem do Double do que Float
	}
}