import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area_tri, area_cir, area_trap, area_quad, area_ret, pi;
		
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		area_tri = (A * B) / 2;
		area_cir = pi * Math.pow(C, 2);
		area_trap = ((A + B) * C) / 2;
		area_quad = B * B;
		area_ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", area_tri);
		System.out.printf("CIRCULO: %.3f%n", area_cir);
		System.out.printf("TRAPEZIO: %.3f%n", area_trap);
		System.out.printf("QUADRADO: %.3f%n", area_quad);
		System.out.printf("RETANGULO: %.3f%n", area_ret);
	}

}
