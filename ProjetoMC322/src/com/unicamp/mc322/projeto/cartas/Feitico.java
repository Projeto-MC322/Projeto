package com.unicamp.mc322.projeto.cartas;

import com.unicamp.mc322.projeto.cartas.efeitos.Efeito;
import com.unicamp.mc322.projeto.main.Campo;

public class Feitico extends Carta {
	Efeito efeito;
	
	public Feitico(String nome, int custo, Efeito efeito) {
		super(nome,custo);
		this.efeito = efeito;
	}

	public void ativarCarta(Campo campo) {
		efeito.ativarEfeito(campo);
	}
}