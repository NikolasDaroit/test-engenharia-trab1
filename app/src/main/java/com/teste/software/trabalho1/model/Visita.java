package com.teste.software.trabalho1.model;

import lombok.Data;

@Data
public class Visita {
	private String codigo;
	private Usuario usuario;
	private String email_usuario;
	private String data_visita;
	private String hora_visita;
	private String nome_instituicao;
	private String tipo_instituicao;
	private String cidade_instituicao;
	private String telefone_instituicao;
	private Integer numero_visitantes;
	private Boolean is_visita_guiada;
	private Boolean has_conteudo_disponivel;
	private Boolean is_auxilio_conteudo_requisitado;
	private String conteudo;
	
	public Visita(String codigo,
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
		this.codigo=codigo;
		this.usuario=usuario;
		this.email_usuario=email_usuario;
		this.data_visita=data_visita;
		this.hora_visita=hora_visita;
		this.nome_instituicao=nome_instituicao;
		this.tipo_instituicao=tipo_instituicao;
		this.cidade_instituicao=cidade_instituicao;
		this.telefone_instituicao=telefone_instituicao;
		this.numero_visitantes=numero_visitantes;
		this.is_visita_guiada=is_visita_guiada;
		this.has_conteudo_disponivel=has_conteudo_disponivel;
		this.is_auxilio_conteudo_requisitado=is_auxilio_conteudo_requisitado;
		this.conteudo=conteudo;
	}
	
	public Visita() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getData_visita() {
		return data_visita;
	}

	public void setData_visita(String data_visita) {
		this.data_visita = data_visita;
	}

	public String getHora_visita() {
		return hora_visita;
	}

	public void setHora_visita(String hora_visita) {
		this.hora_visita = hora_visita;
	}
	
}
