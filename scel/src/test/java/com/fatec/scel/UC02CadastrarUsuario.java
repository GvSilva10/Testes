package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioCom_RAemBranco() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa("");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioCom_RANulo() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa(null);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioCom_obtem_RA() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.getRa());
	}
	
	@Test
	public void CT05CadastrarUsuarioCom_obtem_Nome() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.getNome());
	}
	
	@Test
	public void CT06CadastrarUsuarioCom_NomeNulo() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome(null);
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.getNome());
	}
	
	@Test
	public void CT07CadastrarUsuarioCom_NomeBranco() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.getNome());
	}
	
	@Test
	public void CT08CadastrarUsuarioCom_EqualsNull() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.equals(null));
	}
	
	@Test
	public void CT09CadastrarUsuarioCom_EqualsClass() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.equals(this.getClass()));
	}
	
	@Test
	public void CT10CadastrarUsuarioCom_EqualsObj() {
		// cenario
		Usuario umUsuario = new Usuario();
		Usuario doisUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.equals(doisUsuario));
	}
	
	@Test
	public void CT11CadastrarUsuarioCom_EqualsThis() {
		// cenario
		Usuario umUsuario = new Usuario();
		Usuario doisUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("123");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.equals(umUsuario));
	}
	
	public void CT12CadastrarUsuarioCom_EqualsNomeNull() {
		// cenario
		Usuario umUsuario = new Usuario();
		Usuario doisUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome(null);
			umUsuario.setRa("123");
			doisUsuario.setNome("teste");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals(umUsuario, umUsuario.equals(doisUsuario));
	}
	
	public void CT13CadastrarUsuarioCom_EqualsNomeDiff() {
		// cenario
		Usuario umUsuario = new Usuario();
		Usuario doisUsuario = new Usuario();
		try {
			// acao
			umUsuario.setNome("Andreza");
			umUsuario.setRa("123");
			doisUsuario.setNome("teste");
		} catch (RuntimeException e) {
			// verificacao
		}
		assertEquals("Andreza", umUsuario.getNome().equals(doisUsuario));
	}
}
