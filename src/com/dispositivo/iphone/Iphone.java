package com.dispositivo.iphone;

import com.dispositivo.sistema.SistemaIphone;

public class Iphone {

	public static void main(String[] args) {
		SistemaIphone iphone = new SistemaIphone();
		
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		iphone.ligar();
		iphone.atender();

		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}

}
