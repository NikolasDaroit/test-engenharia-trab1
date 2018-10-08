package com.teste.software.trabalho1.model;

public class UsuarioAdministrador extends Usuario{

	public UsuarioAdministrador(String nome, String login, String senha, String cidade, Integer celular, Integer area,
			String operadora, Integer fixo, String horarioContato, String email) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.cidade = cidade;
		this.horario_contato = horarioContato;
		this.tel_celular = celular;
		this.tel_fixo = fixo;
		this.cod_area = area;
		this.operadora = operadora;
		this.is_admin = false;
	}
	public UsuarioAdministrador() {
		
	}
}
