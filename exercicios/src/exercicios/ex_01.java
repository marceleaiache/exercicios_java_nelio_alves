//Faca um programa para ler dois valores inteiros e depois mostrar na tela a soma desses numeros com uma mensagem explicativa, conforme exemplos//

package exercicios;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		
		int a, b, soma;
		
		System.out.println("Digite 2 numeros inteiros: ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma do numero %d e %d eh igual = %d %n", a, b, soma);
		
		sc.close();
		
	}
}
