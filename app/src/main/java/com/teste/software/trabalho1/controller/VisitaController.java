package com.teste.software.trabalho1.controller;

import java.util.List;

import com.teste.software.trabalho1.model.Usuario;
import com.teste.software.trabalho1.model.Visita;

public class VisitaController {
	public Visita salvarDados(
			String codigo, 
			Usuario usuario, 
			String email_usuario, 
			String data_visita, 
			String hora_visita, 
			String nome_instituicao, 
			String tipo_instituicao, 
			String cidade_instituicao, 
			String telefone_instituicao, 
			Integer numero_visitantes, 
			Boolean is_visita_guiada, 
			Boolean has_conteudo_disponivel, 
			Boolean is_auxilio_conteudo_requisitado, 
			String conteudo) {
		
		if (
				codigo.length()>0 && 
				usuario.getNome().length()>0 && 
				email_usuario.length()>0 && 
				data_visita.length()>0 && 
				hora_visita.length()>0 && 
				nome_instituicao.length()>0 && 
				tipo_instituicao.length()>0 && 
				cidade_instituicao.length()>0 && 
				telefone_instituicao.toString().length()>0 && 
				numero_visitantes.toString().length()>0 && 
				conteudo.length()>0 
				) {
			if (buscar(data_visita, hora_visita) != null) {
				throw new IllegalArgumentException("Visita ja cadastrada nesta data/horario");
			}

			Visita visita = new Visita(codigo, usuario, email_usuario, data_visita, hora_visita, nome_instituicao, tipo_instituicao, cidade_instituicao, telefone_instituicao, numero_visitantes, is_visita_guiada, has_conteudo_disponivel, is_auxilio_conteudo_requisitado, conteudo);
			return visita;
		}
		throw new IllegalArgumentException("faltou algo"); 
		
	}
	
	public Boolean enviaConfirmacao(Visita visita) {
		return false;
	}
	public Visita buscar(String data, String hora) {
		Visita visita = null;
		if (data.equalsIgnoreCase("data") && hora.equals("hora")) {
			visita = new Visita();

		}
		return visita;
	}

	public List buscaVisitas(Usuario usuario) {
		return null;
	}

	public Boolean excluir(String string, String string2) {
		// TODO Auto-generated method stub
		return true;
	}
}
