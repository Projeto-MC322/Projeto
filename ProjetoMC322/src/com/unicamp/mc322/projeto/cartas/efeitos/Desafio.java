/* Escolha uma carta aliada e uma oponente para um combate imediato
 * 
 */
package com.unicamp.mc322.projeto.cartas.efeitos;

import com.unicamp.mc322.projeto.Campo;
import com.unicamp.mc322.projeto.Combate;
import com.unicamp.mc322.projeto.Rodada;
import com.unicamp.mc322.projeto.cartas.Seguidor;
import com.unicamp.mc322.projeto.jogador.Jogador;

public class Desafio extends Efeito {
	
	public Desafio() {
		super(true, true);
	}

	private int unidadeAliada, unidadeOponente;
	
	@Override
	public void ativarEfeito(Campo campo) {		
		Rodada rodada = campo.getRodada();
		Jogador jogadorAtual = rodada.getJogador(rodada.getNumeroJogadorAtual());
		Jogador jogadorOponente = rodada.getJogador(rodada.getNumeroJogadorOponente());
		Combate.iniciar(campo, jogadorAtual, jogadorOponente);
	}
}
