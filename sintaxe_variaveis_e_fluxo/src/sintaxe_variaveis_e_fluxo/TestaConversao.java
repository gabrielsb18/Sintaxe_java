package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario; //O int entre parentese é o responsável que vai converter um numero que antes era flutuante para um valor inteiro//
		System.out.println(valor);
		
		long numeroGrande =  27973940345345l; //Long é responsável por permitir inserir um numero muito longo // E o l no final é reponsável por dizer que meu numero não é um inteiro
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	
		
	}

}
