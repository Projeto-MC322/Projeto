/* A carta ao destruir uma unidade inimiga recebe uma unidade espec�fica na sua m�o
 */

package com.unicamp.mc322.projeto.cartas.efeitos;

import java.util.Scanner;

import com.unicamp.mc322.projeto.campo.Campo;
import com.unicamp.mc322.projeto.cartas.Carta;
import com.unicamp.mc322.projeto.cartas.Seguidor;
import com.unicamp.mc322.projeto.jogador.Jogador;
import com.unicamp.mc322.projeto.rodada.Rodada;

public class MaoDeMidas extends Efeito {
	Carta novaCarta;
	
	public MaoDeMidas(Carta novaCarta) {
		super(true, false);
		super.setTipoEfeito(TipoAtivacao.FIM_DA_RODADA);
		this.novaCarta = novaCarta;
		setNome("M�o de Midas");
		setInfo(" A carta ao destruir uma unidade inimiga recebe uma unidade espec�fica na sua m�o");
	}

	@Override
	public void ativarEfeito(Campo campo) {
		Rodada rodada = campo.getRodada();
		Jogador jogador = rodada.getJogador(rodada.getNumeroJogadorAplicarEfeito());
		int numeroCarta = rodada.getIndexCartaAplicarEfeito();
		Seguidor carta = jogador.getEvocadas().get(numeroCarta);
		
		if(carta.getMatouUmSeguidor() == true) {
			System.out.println("\n Efeito M�o de Midas ativado, jogador recebeu uma carta "+ novaCarta.getTipo() + " " + novaCarta.getNome());
			jogador.getMao().add(novaCarta);
			carta.setMatouUmSeguidor(false);
		}
	}
	
}
