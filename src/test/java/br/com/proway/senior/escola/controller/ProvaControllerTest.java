package br.com.proway.senior.escola.controller;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;

public class ProvaControllerTest {
	
	static ProvaController controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Materia materia = new Materia();
		Integer periodo = 202105;
		Boletim boletim = new Boletim(aluno, periodo);
		Prova prova = new Prova(periodo, boletim.getAluno(), materia);
		controller = new ProvaController(prova); 
	}

	@Test
	public void testProvaControllerProva() {
		fail("Not yet implemented");
	}

	@Test
	public void testProvaControllerInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddProva() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveProva() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

}
