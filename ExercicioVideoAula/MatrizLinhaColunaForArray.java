package JavaTeste;

import java.util.Scanner;

public class MatrizLinhaColunaForArray {
	public static void main(String[] args) {
				
		int [][] matriz = new int[3][3];
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for( int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M [%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		
		System.out.println("\nA matriz fica: \n");
		for( int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		
		
	}
}
