package sintaxe_variaveis_e_fluxo;

public class testacondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {

			System.out.println("Voçê tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voçê não tem 18, mas pode entrar," + "pois está acompanhado");
			} else {

				System.out.println("Infelizmente vove não pode entrar");
			}
		}
	}
}