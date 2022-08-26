package com.generation.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.clases.IntegerSet;

class IntegerSetTests {

	@Test
	void testIntegerSet() {
		IntegerSet matriz1 = new IntegerSet();
		IntegerSet matriz2 = new IntegerSet();
		
		//Se ingresan los elementos [12,23,27,82] a la matriz1
		matriz1.insertsElement(12);
		matriz1.insertsElement(23);
		matriz1.insertsElement(27);
		matriz1.insertsElement(82);
		
		//Verificar que los enteros ingresados anteriormente esten representados en la matriz1
		assertTrue(matriz1.getMatriz()[12]);
		assertTrue(matriz1.getMatriz()[23]);
		assertTrue(matriz1.getMatriz()[27]);
		assertTrue(matriz1.getMatriz()[82]);
		
		//Se ingresan los elementos [5,20,49,82,83] a la matriz2
		matriz2.insertsElement(5);
		matriz2.insertsElement(20);
		matriz2.insertsElement(49);
		matriz2.insertsElement(82);
		matriz2.insertsElement(83);
		
		//Verificar que los enteros ingresados anteriormente esten representados en la matriz1
		assertTrue(matriz2.getMatriz()[5]);
		assertTrue(matriz2.getMatriz()[20]);
		assertTrue(matriz2.getMatriz()[49]);
		assertTrue(matriz2.getMatriz()[82]);
		assertTrue(matriz2.getMatriz()[83]);
		
		//Verificar que la cadena de String sea igual a los numeros ingresados en ambas matrices
		assertEquals(matriz1.toSetString(), "Matriz = 12 23 27 82 ");
		assertEquals(matriz2.toSetString(), "Matriz = 5 20 49 82 83 ");
		
		//Se verifica funcion de union
		IntegerSet matrizUnion = new IntegerSet();
		matrizUnion.setMatriz(matriz1.union(matriz2));
		assertArrayEquals(matrizUnion.getMatriz(), matriz1.union(matriz2));
		
		//
		//Se verifica funcion de interseccion
		IntegerSet matrizInterseccion = new IntegerSet();
		matrizInterseccion.setMatriz(matriz1.interseccion(matriz2));
		assertArrayEquals(matrizInterseccion.getMatriz(), matriz1.interseccion(matriz2));
		
		//Test para borrado de elementos
		matriz1.deleteElement(12);
		assertFalse(matriz1.getMatriz()[12]);
		matriz2.deleteElement(5);
		assertFalse(matriz2.getMatriz()[5]);
		
		//Test para equalTo
		assertTrue(matriz1.equalTo(matriz1));
		assertFalse(matriz1.equalTo(matriz2));
		
		//Se crea una nueva matriz vacia y se espera un -
		IntegerSet matrizVacia = new IntegerSet();
		assertEquals("-", matrizVacia.toSetString());
	}

}
