//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses numeros com uma 
//mensagem explicativa, conforme exemplos

import java.util.Scanner;
public class ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("SOMA = " + soma);

	}

}
