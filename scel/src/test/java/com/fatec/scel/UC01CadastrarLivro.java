package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT03cadastrarLivroComISBN_nulo() {
		// cenario
		Livro livro = new Livro();

		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT04cadastrarLivroCom_obtem_ISBN() {
		// cenario
		Livro umLivro = new Livro();
		try {
			// acao
			
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getIsbn());
		
	}
	
	@Test
	public void CT05cadastrarLivroCom_obtem_Titulo() {
		// cenario
		Livro umLivro = new Livro();
		try {
			// acao
			
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getTitulo());
		
	}
	
	@Test
	public void CT06cadastrarLivroCom_TituloNulo() {
		// cenario
		Livro umLivro = new Livro();
		try {
			// acao
			
			umLivro.setIsbn("121212");
			umLivro.setTitulo(null);
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getTitulo());
		
	}
	
	@Test
	public void CT07cadastrarLivroCom_obtem_Autor() {
		// cenario
		Livro umLivro = new Livro();
		try {
			// acao
			
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getAutor());
		
	}
	
	@Test
	public void CT08cadastrarLivroCom_TituloBranco() {
		// cenario
		Livro umLivro = new Livro();
		try {
			// acao
			
			umLivro.setIsbn("121212");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getTitulo());
		
	}
}