/* A carta ao destruir uma unidade inimiga recebe uma unidade espec�fica na sua m�o
 */

package com.unicamp.mc322.projeto.cartas.efeitos;

import com.unicamp.mc322.projeto.Campo;
import com.unicamp.mc322.projeto.Rodada;
import com.unicamp.mc322.projeto.cartas.Seguidor;
import com.unicamp.mc322.projeto.jogador.Jogador;

public class MaoDeMidas extends Efeito {
	
	public MaoDeMidas() {
		super(true, false);
		super.setTipoEfeito(TipoEfeito.AUTOMATICO);
		setNome("M�o de Midas");
		setInfo(" A carta ao destruir uma unidade inimiga recebe uma unidade espec�fica na sua m�o");
	}

	@Override
	public void ativarEfeito(Campo campo) {
		/*//numeroCartaSelecionada = rodada.getNumeroCartaSelecionada; // recebe atrav�s do resultado da rodada
		Rodada rodada = campo.getRodada();
		Seguidor cartaSelecionada = campo.selecionarUmaUnidade(rodada.getNumeroJogadorAtual(), numeroCartaSelecionada);
		
		if(cartaSelecionada.getMatouUmSeguidor() == true) {
			Jogador jogadorAtual = rodada.getJogador(rodada.getNumeroJogadorAtual());
			jogadorAtual.pegarCarta();
		}*/
	}
	
}
