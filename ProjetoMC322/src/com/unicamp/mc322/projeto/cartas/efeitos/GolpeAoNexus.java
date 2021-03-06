/* Uma unidade evocada ataca nexus do oponente
 * 
 */
package com.unicamp.mc322.projeto.cartas.efeitos;

import com.unicamp.mc322.projeto.campo.Campo;
import com.unicamp.mc322.projeto.cartas.Seguidor;
import com.unicamp.mc322.projeto.rodada.Rodada;

public class GolpeAoNexus extends Efeito {
	private int unidade;
	private GolpeAoNexusLimitado golpeNexus;
	
	public GolpeAoNexus() {
		super(true, false);
		setNome("Golpe ao  Nexus");
		setInfo("Uma unidade evocada ataca o nexus do oponente");
	}
	
	@Override
	public void ativarEfeito(Campo campo) {
		System.out.println("Golpe ao Nexus ativado");
		Rodada rodada = campo.getRodada();
		Seguidor cartaSelecionada = campo.getJogadorAtual().selecionarUmaUnidadeAliada(campo);
		golpeNexus = new GolpeAoNexusLimitado(cartaSelecionada.getPoder());
		golpeNexus.ativarEfeito(campo);
	}
	
	@Override
	public String toString() {
		String texto = "";
		return texto;
	}

}
