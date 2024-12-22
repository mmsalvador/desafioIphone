package com.dispositivo.sistema;

import com.dispositivo.interfaces.AparelhoTelefonico;
import com.dispositivo.interfaces.Navegador;
import com.dispositivo.interfaces.ReprodutorMusical;

import java.util.Random;

public class SistemaIphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
	
	public void tocar() {
		System.out.println("Iphone: Tocando a música selecionada");
	}

	public void pausar() {	
		System.out.println("Iphone: Pausando a música selecionada");
	}
	
	public void selecionarMusica() {	
		System.out.println("Iphone: Foi selecionado uma música");
	}
	
	public void ligar() {
		Random random = new Random();
		boolean atendeu = random.nextBoolean();
		System.out.println("Iphone: Ligando...");
		if (atendeu) {
			System.out.println("Iphone: Ligação atendida");
		}else {
			iniciarCorreioVoz();
		}
	}
	
	public void atender() {	
		System.out.println("Iphone: Um ligação foi atendida");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iphone: Iniciando correio de voz, deixe sua mensagem...");
	
	}
	
	public void exibirPagina() {
		System.out.println("Iphone: Exibindo uma página");
	}

	public void adicionarNovaAba() {
		System.out.println("Iphone: Adicionando Nova Aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Iphone: Atualizando Página Atual");
	}
	
}
