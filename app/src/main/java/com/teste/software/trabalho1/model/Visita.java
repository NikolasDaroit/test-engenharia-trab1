package com.teste.software.trabalho1.model;

import lombok.Data;

@Data
public class Visita {
	public Visita(String codigo2, Usuario usuario2, String email_usuario2, String data_visita2, String hora_visita2,
			String nome_instituicao2, String tipo_instituicao2, String cidade_instituicao2,
			Integer telefone_instituicao2, Integer numero_visitantes2, Boolean is_visita_guiada2,
			Boolean has_conteudo_disponivel2, Boolean is_auxilio_conteudo_requisitado2, String conteudo2) {
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
}
