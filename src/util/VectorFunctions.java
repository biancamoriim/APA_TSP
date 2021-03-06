package util;

import main.Route;

/**
 * @author Bianca Amorim
 *
 *
 */

//Fun��es para auxiliar na manipula��o de vetores ao longo do processo

public class VectorFunctions {
	
	public static void swap(Route[] list, int i, int j) {
		Route temp = list[j];
		list[j] = list[i];
		list[i] = temp;
	}
	
	public static void initializeVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = -1;
		}
	}
	
	public static void initializeVector(long[] vector) {
		for(int i = 0; i < vector.length; i++) {
			vector[i] = 0;
		}
	}
	
	public static void initializeMatrix(long[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	public static void copyVector(int[] vector, int[] copy) {
		for(int i = 0; i < vector.length; i++) {
			copy[i] = vector[i];
		}
	}
}
