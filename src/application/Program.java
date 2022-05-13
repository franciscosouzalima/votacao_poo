package application;

import java.util.Scanner;

import entities.Urna;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean votacaoRolando = true;
		Urna urna;
		int voto;
		
		urna = new Urna();
		urna.iniciarEleicao();
		
		while (votacaoRolando) {
			urna.mostrarCandidatos();
			
			voto = sc.nextInt();
			
			if (voto == 0) {
				votacaoRolando = false;
			} else {
				urna.computarVoto(voto);
			}
		}
		urna.resultadoEleicao();
	}
}