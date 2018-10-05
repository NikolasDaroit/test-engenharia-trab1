package com.teste.software.trabalho1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.teste.software.trabalho1.controller.UsuarioAdministradorController;
import com.teste.software.trabalho1.controller.UsuarioBasicoController;
import com.teste.software.trabalho1.controller.VisitaController;
import com.teste.software.trabalho1.model.Usuario;
import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;

public class VisitaTest {
	VisitaController visitaController;
	UsuarioBasico usuarioBasico;
	@Before
	public void setup() {
		visitaController = new VisitaController();
		usuarioBasico = new UsuarioBasico("nome", "login", "senha", "cidade", 989989, 51, "tim", 3483999, "22h", "email@email.com");
	}
	@Test
	public void salvarVisitaRequeridos() {
		
		assertThat(visitaController.salvarDados("codigo", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 1, true, true, true, "conteudo")).isInstanceOf(Visita.class);
	}
	@Test
	public void salvarVisitaSemRequeridos() {
		assertThatThrownBy(() -> { visitaController.salvarDados("", usuarioBasico, "email_usuario", "data_visita", "hora_visita", "nome_instituicao", "tipo_instituicao", "cidade_instituicao", "2342342", 1, true, true, true, "conteudo"); })
		.isInstanceOf(IllegalArgumentException.class);
		
	}
}
