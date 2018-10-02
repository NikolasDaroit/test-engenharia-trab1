package com.teste.software.trabalho1.controller;

import com.teste.software.trabalho1.model.Usuario;
import com.teste.software.trabalho1.model.Visita;

public class UsuarioBasicoController extends UsuarioController{

	public Usuario login(String usr, String pass) { return null; }
	public Boolean verificarDados(String usr) { return false; }
	public Boolean salvarDados(String usr, String pass) { return false; }
	public Boolean enviarEmailConfirmacao() { return false; }
	public Visita cadastrarVisita() { return null; }
	public Boolean excluirVisita(Visita visita) { return false; } 


}
