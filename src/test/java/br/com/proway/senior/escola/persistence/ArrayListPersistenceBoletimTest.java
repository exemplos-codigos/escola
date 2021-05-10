package br.com.proway.senior.escola.persistence;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import br.com.proway.senior.escola.controller.BoletimController;
import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;

public class ArrayListPersistenceBoletimTest {

	static ArrayListPersistenceBoletim persistence;
	static BoletimController controller;
	private static int periodoPadrao = 202105;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		Boletim boletim = new Boletim(aluno, periodo);
		controller = new BoletimController(boletim);
	}

	@Test
	public void testRemoveAll() {
		persistence = new ArrayListPersistenceBoletim();
		assertTrue(persistence.removeAll());
	}

	@Test
	public void testRemove() {
		persistence = new ArrayListPersistenceBoletim();
		Boletim boletim = controller.getBoletim();
		persistence.add(boletim);
		assertTrue(persistence.remove(0));
	}

	@Test
	public void testAddBoletim() {
		persistence = new ArrayListPersistenceBoletim();
		Boletim boletim = controller.getBoletim();
		persistence.add(boletim);
		assertEquals(boletim, persistence.get(0));
	}

	@Test
	public void testGetInteger() {
		persistence = new ArrayListPersistenceBoletim();
		Boletim boletim = controller.getBoletim();
		assertEquals(boletim, persistence.add(boletim));
	}

	@Test
	public void testGetAll() {
		ArrayList<Boletim> dados = new ArrayList<Boletim>();
		persistence = new ArrayListPersistenceBoletim();
		assertEquals(dados, persistence.getAll());
	}

}
