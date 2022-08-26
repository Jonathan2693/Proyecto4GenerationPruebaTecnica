package com.generation.clases;

import java.util.Arrays;

/**
 * 
 * @author Jonathan Quino
 * @Description Clase IntegerSet para guardar datos integer en una matriz booleana
 */
public class IntegerSet {

	private boolean[] matriz; //Se decide por un vector booleano, listas, sets y map pueden implementarse pero esta sobrado su uso
	
	/**
	 * @Description Constructor donde se declara el tamaño de la matriz para enteros de 0-100
	 * y se inicia con valores falsos en todas sus posiciones
	 */
	public IntegerSet() {
		this.matriz = new boolean[101];
		Arrays.fill(matriz, false);
	}
	
	/**
	 * @Description Metodo paraingresar un nuevo entero k, por lo tanto a[k] = true
	 * @param elemento
	 */
	public void insertsElement(int elemento) {
		this.matriz[elemento]=true;
	}
	
	/**
	 * @Description Metodo para borrar un entero k, por lo tanto a[k] = false
	 * @param enteros
	 */
	public void deleteElement(int elemento) {
		this.matriz[elemento] = false;
	}
	
	/**
	 * Metodo para calcular la matriz union de dos IntegerSet, que son matrices booleanas que contienen enteros de 0-101
	 * IntegerSet matriz1 U IntegerSet matriz2
	 * @param matriz2
	 * @return boolean[]
	 */
	public boolean[] union(IntegerSet matriz2) {
		boolean[] matrizUnion = new boolean[101];
		for(int i=0; i<matriz2.getMatriz().length; i++) {
			matrizUnion[i]= Boolean.logicalOr(this.matriz[i], matriz2.getMatriz()[i]);
		}
		return matrizUnion;
	}
	
	/**
	 * Metodo para calcular la matriz interseccion de dos IntegerSet, que son matrices booleanas que contienen enteros de 0-101
	 * IntegerSet matriz1 ^ IntegerSet matriz2
	 * @param matriz2
	 * @return boolean[]
	 */
	public boolean[] interseccion(IntegerSet matriz2) {
		boolean[] matrizInterseccion = new boolean[101];
		for(int i=0; i<matriz2.getMatriz().length; i++) {
			matrizInterseccion[i]= Boolean.logicalAnd(this.matriz[i], matriz2.getMatriz()[i]);
		}
		return matrizInterseccion;
	}
	
	/**
	 * Metodo que devuelve una cadena de caracteres con los numeros enteros que existen dentro de la matriz booleana
	 * @return String
	 */
	public String toSetString() {
		String cadena = "Matriz = ";
		
		for(int i=0 ; i<this.matriz.length ; i++) {
			String caracter = (this.matriz[i]==true) ? String.valueOf(i).concat(" ") : "";
			cadena += caracter;
		}
		if(cadena.length()<10) {	//Si no se concateno ningun caracter, el conjunto esta vacio
			return "-";
		}
		return cadena;
	}
	
	/**
	 * Metodo que devuelve true si las matrices son iguales en valor matriz1 X matriz2
	 * @param matriz2
	 * @return
	 */
	public boolean equalTo(IntegerSet matriz2) {
		return (this.matriz == matriz2.getMatriz()) ? true : false;
	}

	public boolean[] getMatriz() {
		return matriz;
	}

	public void setMatriz(boolean[] matriz) {
		this.matriz = matriz;
	}
	
	
}
