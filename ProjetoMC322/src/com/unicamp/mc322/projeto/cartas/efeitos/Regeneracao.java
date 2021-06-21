/* Cura totalmente uma carta aliada
 * 
 */

package com.unicamp.mc322.projeto.cartas.efeitos;

import java.util.Scanner;

import com.unicamp.mc322.projeto.Campo;
import com.unicamp.mc322.projeto.Rodada;
import com.unicamp.mc322.projeto.cartas.Caracteristica;
import com.unicamp.mc322.projeto.cartas.Seguidor;

public class Regeneracao extends Efeito {
	private int unidade;

	@Override
	public void ativarEfeito(Campo campo) {
		Rodada rodada = campo.getRodada();
		this.unidade = usuarioEscolherUnidade("Selecione a unidade o qual deseja ativar o efeito: ");
		Seguidor cartaSelecionada = (Seguidor) campo.selecionarUmaUnidade(rodada.getNumeroJogadorAtual(), unidade);
		
		if(cartaSelecionada != null) {
			int novaVida = cartaSelecionada.getVidaTotal();
			campo.alterarCartaEmCampo(rodada.getNumeroJogadorAtual(), unidade, Caracteristica.VIDA, novaVida);
		}
	}

}
