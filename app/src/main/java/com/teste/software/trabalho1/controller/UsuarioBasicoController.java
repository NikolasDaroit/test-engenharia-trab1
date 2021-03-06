package com.teste.software.trabalho1.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.teste.software.trabalho1.model.Usuario;
import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;

public class UsuarioBasicoController extends UsuarioController{

	public Usuario login(String usr, String pass) { return null; }
	
	public Boolean verificarDados(
			String nome, String login, String senha, String cidade, 
			Integer celular, Integer area, String operadora, Integer fixo, 
			String horarioContato, String email) { 
		if (nome.length()>0 && login.length()>0 && senha.length()>0&&cidade.length()>0 &&
				celular.toString().length()>0&&area.toString().length()>0&&email.length()>0) {
			
			Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
	        Matcher mat = pattern.matcher(email);
	        if(mat.matches()){
	        	if (isLegalString(nome) && isLegalString(cidade)) {
	        		return true;
	        		
	        	}else {
		        	throw new IllegalArgumentException("Caracteres invalidos");
		        }
	        }else {
	        	throw new IllegalArgumentException("Email invalido");
	        }
		}else {
			throw new IllegalArgumentException("faltou algo");
		}
	}
	
	public Usuario salvarDados(
			String nome, String login, String senha, String cidade, 
			Integer celular, Integer area, String operadora, Integer fixo, 
			String horarioContato, String email) {
		if (verificarDados(nome,login,senha,cidade,celular,area,operadora,fixo,horarioContato,email)) {
			Usuario newUsuario = new UsuarioBasico(nome, login, senha, cidade, celular, area, operadora, fixo, horarioContato, email);
			return newUsuario;
			
		}
		return null;
		
	}
	public String listaUsuario(Usuario usr) {
		return usr.toString();
	}
	
	public Boolean enviarEmailConfirmacao() { return false; }
	public Visita cadastrarVisita(String codigo, Usuario usuario, String email_usuario, String data_visita, String hora_visita, String nome_instituicao, String tipo_instituicao, String cidade_instituicao, String telefone_instituicao, Integer numero_visitantes, Boolean is_visita_guiada, Boolean has_conteudo_disponivel, Boolean is_auxilio_conteudo_requisitado, String conteudo) {
			
		VisitaController visitaController = new VisitaController();
		Visita visita = visitaController.salvarDados(codigo, usuario, email_usuario, data_visita, hora_visita, nome_instituicao, tipo_instituicao, cidade_instituicao, telefone_instituicao, numero_visitantes, is_visita_guiada, has_conteudo_disponivel, is_auxilio_conteudo_requisitado, conteudo);
		return visita;
		 
	}
	public Boolean excluirVisita(Visita visita) { return false; } 

	public boolean isLegalString(String toExamine) {
	    Pattern pattern = Pattern.compile("[~#@*+%{}<>\\[\\]|\"\\_^]");
	    Matcher matcher = pattern.matcher(toExamine);
	    return !matcher.find();
	}
}
