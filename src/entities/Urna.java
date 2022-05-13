package entities;


public class Urna {
	
	private int votosLula;
	private int votosBozo;
	
	public void iniciarEleicao() {
		System.out.println("\n[****** Eleições Iniciadas - Escolha seu Candidato ******]\n");
	}
	
	public void mostrarCandidatos() {
		System.out.println("Digite o numero do seu candidato ou [0] para finalizar a eleição: ");
		System.out.println("PT - Lula - 13");
		System.out.println("PL - Bolsonaro - 17");
	}
	
	public void computarVoto(int voto) {
		if (voto == 13) {
			votosLula += 1;
		} else if (voto == 17) {
			votosBozo += 1;
		}
	}
	
	public void resultadoEleicao() {
		System.out.println("\n[***************** Resultado da Eleição *****************]");
		System.out.println("PT - Lula - Qtd de Votos: " + votosLula + " - " + 100*votosLula/(votosLula+votosBozo) + "%");
		System.out.println("PL - Bolsonaro - Qtd de Votos: " + votosBozo + " - " + 100*votosBozo/(votosLula+votosBozo) + "%");
		if (votosLula>votosBozo) {
			System.out.println("\n[***************** Vencedor - LULA  *****************]");
		} else {
			System.out.println("\n[***************** Vencedor - BOLSONARO  *****************]");
		}	
	}
}
