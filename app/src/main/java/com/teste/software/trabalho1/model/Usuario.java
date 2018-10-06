package com.teste.software.trabalho1.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public abstract class Usuario {
	protected String email;
	protected String senha;
	protected String nome;
	protected String cidade;
	protected String horario_contato;
	protected Integer tel_celular;
	protected Integer tel_fixo;
	protected Integer cod_area;
	protected String operadora;
	protected Boolean is_admin;
	protected ArrayList<Visita> visitas;
	
	public String getNome() {
		return nome;
	}

}
