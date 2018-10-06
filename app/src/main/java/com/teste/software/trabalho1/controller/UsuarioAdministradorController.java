package com.teste.software.trabalho1.controller;

import java.util.ArrayList;
import java.util.List;

import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;

public class UsuarioAdministradorController extends UsuarioController{
	public List consultarDadosUsuario(){ return null;}
	public String consultarDadosTodasVisitas(ArrayList<Visita> visitas){
		StringBuilder dadosDeTodasAsVisitas = new StringBuilder(); 
		//pega os dados de cada visita e coloca tudo na mesma string
		for (Visita visita : visitas) {
			dadosDeTodasAsVisitas.append(visita.getUsuario().getNome() + "\n" +
										visita.getUsuario().getEmail() + "\n" +
										visita.getData_visita() + "\n" +
										visita.getHora_visita());
		}
		return dadosDeTodasAsVisitas.toString();
	}
	public Boolean editarVisita(Visita visita){return false;}
	
}
