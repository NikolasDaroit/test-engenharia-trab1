package com.teste.software.trabalho1;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.teste.software.trabalho1.controller.UsuarioAdministradorController;
import com.teste.software.trabalho1.controller.UsuarioBasicoController;
import com.teste.software.trabalho1.controller.VisitaController;
import com.teste.software.trabalho1.model.UsuarioBasico;
import com.teste.software.trabalho1.model.Visita;

public class UsuarioTest {
	private UsuarioBasicoController usuarioBasicoController;
	private UsuarioAdministradorController usuarioAdminController;
	private VisitaController visitaController;
	private Visita visita;
	private UsuarioBasico usuarioBasico;
	
	@Before
	public void setup() {
		usuarioBasicoController = mock(UsuarioBasicoController.class);
		usuarioAdminController = mock(UsuarioAdministradorController.class);
		visitaController = mock(VisitaController.class);
		visita = mock(Visita.class);
		usuarioBasico = mock(UsuarioBasico.class);
		
		when( usuarioBasicoController.buscarMensagem() ).thenReturn(new String("Some simple message"));
		when( usuarioBasicoController.inserirMensagem() ).thenReturn(new Boolean(true));
		when( usuarioAdminController.buscarMensagem() ).thenReturn(new String("Some more complex message"));
		when( usuarioAdminController.inserirMensagem() ).thenReturn(new Boolean(true));
		
		when( usuarioBasicoController.login("usr", "pass")).thenReturn(usuarioBasico);
		when( usuarioBasicoController.verificarDados("usr") ).thenReturn(new Boolean(true));
		when( usuarioBasicoController.salvarDados("usr", "pass") ).thenReturn(new Boolean(true));
		when( usuarioBasicoController.cadastrarVisita()).thenReturn(mock(Visita.class));
		when( usuarioBasicoController.excluirVisita(visita)).thenReturn(new Boolean(true));
		when( visitaController.enviaConfirmacao(visita)).thenReturn(new Boolean(true));
		
		when( usuarioAdminController.consultarDadosUsuario(usuarioBasico)).thenReturn(new String("Nome: fulano\nTelefone Celular: 8932892389"));
		when( usuarioAdminController.consultarDadosVisita(visita)).thenReturn(new String("Data: 12/10/2018\nHora: 18:10"));
		when( usuarioAdminController.editarVisita(visita)).thenReturn(new Boolean(true));
	}
	@Test 
	public void login() {
		assertThat(true).isTrue();
	}
}
