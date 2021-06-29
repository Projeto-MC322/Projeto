package com.unicamp.mc322.projeto.cartas;

import java.util.ArrayList;

import com.unicamp.mc322.projeto.cartas.efeitos.Efeito;
import com.unicamp.mc322.projeto.cartas.tracos.TipoTraco;
import com.unicamp.mc322.projeto.cartas.tracos.Traco;
import com.unicamp.mc322.projeto.jogador.Jogador;

public class Seguidor extends Carta {
	private int poder, vida, vidaTotal;
	private Traco traco=null;
	private ArrayList<Efeito> listaEfeitos = new ArrayList<Efeito>();
	private boolean matouUmSeguidor = false;  // Alterado na classe combate

	public Seguidor(String nome, int custo, int poder, int vidaTotal, Traco traco, Efeito... efeitos) {
		super(nome,custo, TipoCarta.SEGUIDOR);
		this.poder = poder;
		this.vidaTotal = vidaTotal;
		this.traco = traco;
		vida = vidaTotal;
		
		for(Efeito aux : efeitos) {
			listaEfeitos.add(aux);
		}
	}
	
	public Seguidor(String nome, int custo, TipoCarta tipo, int poder, int vidaTotal, Traco traco, Efeito... efeitos) {
		super(nome,custo, tipo);
		this.poder = poder;
		this.vidaTotal = vidaTotal;
		this.traco = traco;
		vida = vidaTotal;
		
		for(Efeito aux : efeitos) {
			listaEfeitos.add(aux);
		}
	}
	
	public int getPoder() {
		return poder;
	}
	
	public void setPoder(int novoPoder) {
		poder = novoPoder;
	}
	
	public void aumentarPoder(int n) {//Para o traco da furia. Ele acrescenta, nao muda. Por isso acho q é diferente de setPoder
		poder+=n;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int novaVida) {
		vida = novaVida;
	}
	
	public void aumentarVida(int m) {//Para o traco da furia. Ele acrescenta, nao muda. Por isso acho q é diferente de setVida
		vida+=m;
	}
	
	public int getVidaTotal() {
		return vidaTotal;
	}
	
	public void setMatouUmSeguidor(boolean matouUmSeguidor) {
		this.matouUmSeguidor = matouUmSeguidor;
	}
	
	public boolean getMatouUmSeguidor() {
		return matouUmSeguidor;
	}
	
	public void ativacaoTraco(Seguidor cartaDefensor, Jogador defensor) {//Para ativar o traco
		traco.ativarTraco(this, cartaDefensor, defensor);
	}
	
	public boolean getHaTraco() {
		if(traco!=null) {
			return true;
		}
		return false;
	}
	
	public TipoTraco getTipoTraco() {
		return traco.getTraco();
	}
	
	
	@Override
	public String toString() {
		String texto = this.tipo + " " + this.nome + ", Custo: " + this.custo;
		texto += ", Vida: " + this.vida + ", Poder: " + this.poder;
		return texto;
	}
	
	@Override
	public String toStringCompra() {
		String texto = "<html>";
		texto += this.nome + "<br />";
		texto += "Vida: " + Integer.toString(this.vida) + "<br />";
		texto += "Poder: " + Integer.toString(this.poder) + "<br />";
		texto += "Custo: " + Integer.toString(this.custo);
		texto += "</html>";
		return texto;
	}
	
	public String toStringEvocada() {
		String texto = "<html>";
		texto += this.nome + "<br />";
		texto += "Vida: " + Integer.toString(this.vida) + "<br />";
		texto += "Poder: " + Integer.toString(this.poder) + "<br />";
		texto += "</html>";
		return texto;
	}
	
	public String toStringEmCampo() {
		String texto = "<html>";
		texto += this.nome + "<br />";
		texto += "V: " + Integer.toString(this.vida);
		texto += "  P: " + Integer.toString(this.poder);
		return texto;
	}
	
	@Override
	public String toStringDetalhes() {
		String texto = this.tipo + this.nome + ", Custo: " + this.custo;
		texto += ", Vida: " + this.vida + ", Poder: " + this.poder;
		return texto;
	}
}
	