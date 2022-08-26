package com.generation;

import com.generation.clases.IntegerSet;

/**
 * 
 * @author Jonathan Quino
 *@Description Clase main para ejecutar las operaciones de clases IntegerSet
 */
public class Main {

	public static void main(String[] args) {
		
		//Instanciar dos matrices de tipo IntegerSet
		IntegerSet matriz1 = new IntegerSet();
		IntegerSet matriz2 = new IntegerSet();
		
		//Se ingresan los elementos [2,23,27,52] a la matriz1
		matriz1.insertsElement(2);
		matriz1.insertsElement(23);
		matriz1.insertsElement(27);
		matriz1.insertsElement(52);
		
		//Se ingresan los elementos [0,27,32,74,99] a la matriz2
		matriz2.insertsElement(0);
		matriz2.insertsElement(27);
		matriz2.insertsElement(32);
		matriz2.insertsElement(74);
		matriz2.insertsElement(99);
		
		//Se imprime en consola el contenido de ambas matrices
		System.out.println("Impresion de matrices originales");
		System.out.println("La matriz contiene los siguientes enteros = "+ matriz1.toSetString());
		System.out.println("La matriz contiene los siguientes enteros = "+ matriz2.toSetString());
		
		//operacion de union de matriz1 y matriz2	El resultado de la matriz serian los numeros de ambas matrices
		IntegerSet matrizUnion = new IntegerSet();
		matrizUnion.setMatriz(matriz1.union(matriz2));
		System.out.println("Impresion de matriz Union");
		System.out.println("La matriz contiene los siguientes enteros = "+ matrizUnion.toSetString());
		
		//operacion de interseccion de matriz1 y matriz 2		Solo debe ser comun un elemento, por lo tanto una matriz con el numero 27
		IntegerSet matrizInterseccion = new IntegerSet();
		matrizInterseccion.setMatriz(matriz1.interseccion(matriz2));
		System.out.println("Impresion de matriz interseccion");
		System.out.println("La matriz contiene los siguientes enteros = "+ matrizInterseccion.toSetString());
		
		//Borrar dos elementos de la matriz 2 [32 y 99]
		matriz2.deleteElement(32);
		matriz2.deleteElement(99);
		System.out.println("Impresion de matriz2 con elementos borrados");
		System.out.println("La matriz contiene los siguientes enteros = "+ matriz2.toSetString());
		
		//Se comparan las matrices creadas, resultara en false
		System.out.println("Comparacion de matriz 1 con la 2");
		System.out.println("Las matrices son iguales? = " + matriz1.equalTo(matriz2));
		
		//Se compara la matriz1 consigo misma Reflexion
		System.out.println("Comparacion de matriz consigo misma");
		System.out.println("Las matrices son iguales? = " + matriz1.equalTo(matriz1));
		
		//Se eliminan todos los numeros de la matriz, y se muestra un - por ser arreglo vacio
		matriz2.deleteElement(0);
		matriz2.deleteElement(27);
		matriz2.deleteElement(32);
		matriz2.deleteElement(74);
		matriz2.deleteElement(99);
		System.out.println("Arreglo vacio = " + matriz2.toSetString());
	}

}
