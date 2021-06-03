/* ------------------------------------------------------------------------------------
 * A ideia � que seja semelhante a classe "Game" que est� como exemplo na especifica��o 
 * do projeto final
 * ------------------------------------------------------------------------------------
 */
package com.unicamp.mc322.projeto.main;

import com.unicamp.mc322.projeto.jogador.Jogador;
import com.unicamp.mc322.projeto.turno.Turno;

public class Jogo {
	private Jogador p1 = new Jogador(Turno.ATAQUE);
	private Jogador p2 = new Jogador(Turno.DEFESA);
	private Campo campo = new Campo(p1,p2);
	private Rodada rodadaAtual = new Rodada();
	
	// S� uns exemplos de m�todos pra por aqui 
	public void iniciarPartida() {}
	public void encerrarRodada() {}
	private void combater() {}
}
